package fr.spacefox.perftests.quarkus.rest.endpoint615;

import fr.spacefox.perftests.quarkus.core.service615.Service615;
import fr.spacefox.perftests.quarkus.rest.endpoint615.schema.Schema615;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint615")
public class Endpoint615Resource {

    private final Service615 service;

    public Endpoint615Resource(Service615 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema615 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
