package fr.spacefox.perftests.quarkus.rest.endpoint629;

import fr.spacefox.perftests.quarkus.core.service629.Service629;
import fr.spacefox.perftests.quarkus.rest.endpoint629.schema.Schema629;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint629")
public class Endpoint629Resource {

    private final Service629 service;

    public Endpoint629Resource(Service629 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema629 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
