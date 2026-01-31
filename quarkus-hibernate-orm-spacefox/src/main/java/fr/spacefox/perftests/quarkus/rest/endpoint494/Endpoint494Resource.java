package fr.spacefox.perftests.quarkus.rest.endpoint494;

import fr.spacefox.perftests.quarkus.core.service494.Service494;
import fr.spacefox.perftests.quarkus.rest.endpoint494.schema.Schema494;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint494")
public class Endpoint494Resource {

    private final Service494 service;

    public Endpoint494Resource(Service494 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema494 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
