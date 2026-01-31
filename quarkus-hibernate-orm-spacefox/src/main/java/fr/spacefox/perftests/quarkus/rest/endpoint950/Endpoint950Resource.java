package fr.spacefox.perftests.quarkus.rest.endpoint950;

import fr.spacefox.perftests.quarkus.core.service950.Service950;
import fr.spacefox.perftests.quarkus.rest.endpoint950.schema.Schema950;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint950")
public class Endpoint950Resource {

    private final Service950 service;

    public Endpoint950Resource(Service950 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema950 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
