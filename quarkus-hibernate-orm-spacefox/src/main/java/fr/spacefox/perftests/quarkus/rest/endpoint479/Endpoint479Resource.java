package fr.spacefox.perftests.quarkus.rest.endpoint479;

import fr.spacefox.perftests.quarkus.core.service479.Service479;
import fr.spacefox.perftests.quarkus.rest.endpoint479.schema.Schema479;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint479")
public class Endpoint479Resource {

    private final Service479 service;

    public Endpoint479Resource(Service479 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema479 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
