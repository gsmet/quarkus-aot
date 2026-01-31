package fr.spacefox.perftests.quarkus.rest.endpoint471;

import fr.spacefox.perftests.quarkus.core.service471.Service471;
import fr.spacefox.perftests.quarkus.rest.endpoint471.schema.Schema471;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint471")
public class Endpoint471Resource {

    private final Service471 service;

    public Endpoint471Resource(Service471 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema471 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
