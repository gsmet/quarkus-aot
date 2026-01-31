package fr.spacefox.perftests.quarkus.rest.endpoint306;

import fr.spacefox.perftests.quarkus.core.service306.Service306;
import fr.spacefox.perftests.quarkus.rest.endpoint306.schema.Schema306;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint306")
public class Endpoint306Resource {

    private final Service306 service;

    public Endpoint306Resource(Service306 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema306 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
