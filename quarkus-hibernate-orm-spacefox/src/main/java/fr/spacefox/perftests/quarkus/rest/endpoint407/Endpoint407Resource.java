package fr.spacefox.perftests.quarkus.rest.endpoint407;

import fr.spacefox.perftests.quarkus.core.service407.Service407;
import fr.spacefox.perftests.quarkus.rest.endpoint407.schema.Schema407;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint407")
public class Endpoint407Resource {

    private final Service407 service;

    public Endpoint407Resource(Service407 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema407 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
