package fr.spacefox.perftests.quarkus.rest.endpoint751;

import fr.spacefox.perftests.quarkus.core.service751.Service751;
import fr.spacefox.perftests.quarkus.rest.endpoint751.schema.Schema751;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint751")
public class Endpoint751Resource {

    private final Service751 service;

    public Endpoint751Resource(Service751 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema751 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
