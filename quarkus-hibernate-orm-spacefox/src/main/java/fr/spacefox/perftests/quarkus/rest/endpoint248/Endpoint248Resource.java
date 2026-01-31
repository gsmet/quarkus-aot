package fr.spacefox.perftests.quarkus.rest.endpoint248;

import fr.spacefox.perftests.quarkus.core.service248.Service248;
import fr.spacefox.perftests.quarkus.rest.endpoint248.schema.Schema248;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint248")
public class Endpoint248Resource {

    private final Service248 service;

    public Endpoint248Resource(Service248 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema248 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
