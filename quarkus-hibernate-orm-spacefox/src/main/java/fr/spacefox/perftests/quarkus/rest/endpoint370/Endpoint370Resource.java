package fr.spacefox.perftests.quarkus.rest.endpoint370;

import fr.spacefox.perftests.quarkus.core.service370.Service370;
import fr.spacefox.perftests.quarkus.rest.endpoint370.schema.Schema370;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint370")
public class Endpoint370Resource {

    private final Service370 service;

    public Endpoint370Resource(Service370 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema370 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
