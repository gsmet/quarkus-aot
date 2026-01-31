package fr.spacefox.perftests.quarkus.rest.endpoint84;

import fr.spacefox.perftests.quarkus.core.service84.Service84;
import fr.spacefox.perftests.quarkus.rest.endpoint84.schema.Schema84;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint84")
public class Endpoint84Resource {

    private final Service84 service;

    public Endpoint84Resource(Service84 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema84 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
