package fr.spacefox.perftests.quarkus.rest.endpoint297;

import fr.spacefox.perftests.quarkus.core.service297.Service297;
import fr.spacefox.perftests.quarkus.rest.endpoint297.schema.Schema297;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint297")
public class Endpoint297Resource {

    private final Service297 service;

    public Endpoint297Resource(Service297 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema297 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
