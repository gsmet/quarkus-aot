package fr.spacefox.perftests.quarkus.rest.endpoint481;

import fr.spacefox.perftests.quarkus.core.service481.Service481;
import fr.spacefox.perftests.quarkus.rest.endpoint481.schema.Schema481;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint481")
public class Endpoint481Resource {

    private final Service481 service;

    public Endpoint481Resource(Service481 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema481 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
