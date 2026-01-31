package fr.spacefox.perftests.quarkus.rest.endpoint7;

import fr.spacefox.perftests.quarkus.core.service7.Service7;
import fr.spacefox.perftests.quarkus.rest.endpoint7.schema.Schema7;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint7")
public class Endpoint7Resource {

    private final Service7 service;

    public Endpoint7Resource(Service7 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema7 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
