package fr.spacefox.perftests.quarkus.rest.endpoint975;

import fr.spacefox.perftests.quarkus.core.service975.Service975;
import fr.spacefox.perftests.quarkus.rest.endpoint975.schema.Schema975;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint975")
public class Endpoint975Resource {

    private final Service975 service;

    public Endpoint975Resource(Service975 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema975 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
