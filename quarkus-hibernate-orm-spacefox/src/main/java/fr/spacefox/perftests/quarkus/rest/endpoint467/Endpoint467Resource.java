package fr.spacefox.perftests.quarkus.rest.endpoint467;

import fr.spacefox.perftests.quarkus.core.service467.Service467;
import fr.spacefox.perftests.quarkus.rest.endpoint467.schema.Schema467;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint467")
public class Endpoint467Resource {

    private final Service467 service;

    public Endpoint467Resource(Service467 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema467 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
