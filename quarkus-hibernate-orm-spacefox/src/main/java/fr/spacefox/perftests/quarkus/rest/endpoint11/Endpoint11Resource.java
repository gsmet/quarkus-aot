package fr.spacefox.perftests.quarkus.rest.endpoint11;

import fr.spacefox.perftests.quarkus.core.service11.Service11;
import fr.spacefox.perftests.quarkus.rest.endpoint11.schema.Schema11;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint11")
public class Endpoint11Resource {

    private final Service11 service;

    public Endpoint11Resource(Service11 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema11 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
