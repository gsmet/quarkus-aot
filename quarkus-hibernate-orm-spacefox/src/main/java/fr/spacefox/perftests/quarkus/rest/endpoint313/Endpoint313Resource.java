package fr.spacefox.perftests.quarkus.rest.endpoint313;

import fr.spacefox.perftests.quarkus.core.service313.Service313;
import fr.spacefox.perftests.quarkus.rest.endpoint313.schema.Schema313;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint313")
public class Endpoint313Resource {

    private final Service313 service;

    public Endpoint313Resource(Service313 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema313 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
