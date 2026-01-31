package fr.spacefox.perftests.quarkus.rest.endpoint134;

import fr.spacefox.perftests.quarkus.core.service134.Service134;
import fr.spacefox.perftests.quarkus.rest.endpoint134.schema.Schema134;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint134")
public class Endpoint134Resource {

    private final Service134 service;

    public Endpoint134Resource(Service134 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema134 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
