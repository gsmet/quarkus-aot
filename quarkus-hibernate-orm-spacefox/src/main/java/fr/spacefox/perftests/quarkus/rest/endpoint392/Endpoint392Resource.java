package fr.spacefox.perftests.quarkus.rest.endpoint392;

import fr.spacefox.perftests.quarkus.core.service392.Service392;
import fr.spacefox.perftests.quarkus.rest.endpoint392.schema.Schema392;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint392")
public class Endpoint392Resource {

    private final Service392 service;

    public Endpoint392Resource(Service392 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema392 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
