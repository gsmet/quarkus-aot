package fr.spacefox.perftests.quarkus.rest.endpoint197;

import fr.spacefox.perftests.quarkus.core.service197.Service197;
import fr.spacefox.perftests.quarkus.rest.endpoint197.schema.Schema197;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint197")
public class Endpoint197Resource {

    private final Service197 service;

    public Endpoint197Resource(Service197 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema197 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
