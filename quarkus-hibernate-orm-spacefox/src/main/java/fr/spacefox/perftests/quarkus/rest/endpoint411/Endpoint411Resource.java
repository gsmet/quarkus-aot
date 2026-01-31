package fr.spacefox.perftests.quarkus.rest.endpoint411;

import fr.spacefox.perftests.quarkus.core.service411.Service411;
import fr.spacefox.perftests.quarkus.rest.endpoint411.schema.Schema411;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint411")
public class Endpoint411Resource {

    private final Service411 service;

    public Endpoint411Resource(Service411 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema411 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
