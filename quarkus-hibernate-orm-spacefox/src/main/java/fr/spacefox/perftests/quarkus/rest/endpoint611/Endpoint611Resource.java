package fr.spacefox.perftests.quarkus.rest.endpoint611;

import fr.spacefox.perftests.quarkus.core.service611.Service611;
import fr.spacefox.perftests.quarkus.rest.endpoint611.schema.Schema611;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint611")
public class Endpoint611Resource {

    private final Service611 service;

    public Endpoint611Resource(Service611 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema611 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
