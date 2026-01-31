package fr.spacefox.perftests.quarkus.rest.endpoint486;

import fr.spacefox.perftests.quarkus.core.service486.Service486;
import fr.spacefox.perftests.quarkus.rest.endpoint486.schema.Schema486;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint486")
public class Endpoint486Resource {

    private final Service486 service;

    public Endpoint486Resource(Service486 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema486 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
