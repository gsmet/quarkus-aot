package fr.spacefox.perftests.quarkus.rest.endpoint264;

import fr.spacefox.perftests.quarkus.core.service264.Service264;
import fr.spacefox.perftests.quarkus.rest.endpoint264.schema.Schema264;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint264")
public class Endpoint264Resource {

    private final Service264 service;

    public Endpoint264Resource(Service264 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema264 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
