package fr.spacefox.perftests.quarkus.rest.endpoint531;

import fr.spacefox.perftests.quarkus.core.service531.Service531;
import fr.spacefox.perftests.quarkus.rest.endpoint531.schema.Schema531;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint531")
public class Endpoint531Resource {

    private final Service531 service;

    public Endpoint531Resource(Service531 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema531 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
