package fr.spacefox.perftests.quarkus.rest.endpoint340;

import fr.spacefox.perftests.quarkus.core.service340.Service340;
import fr.spacefox.perftests.quarkus.rest.endpoint340.schema.Schema340;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint340")
public class Endpoint340Resource {

    private final Service340 service;

    public Endpoint340Resource(Service340 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema340 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
