package fr.spacefox.perftests.quarkus.rest.endpoint720;

import fr.spacefox.perftests.quarkus.core.service720.Service720;
import fr.spacefox.perftests.quarkus.rest.endpoint720.schema.Schema720;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint720")
public class Endpoint720Resource {

    private final Service720 service;

    public Endpoint720Resource(Service720 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema720 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
