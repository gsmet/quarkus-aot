package fr.spacefox.perftests.quarkus.rest.endpoint730;

import fr.spacefox.perftests.quarkus.core.service730.Service730;
import fr.spacefox.perftests.quarkus.rest.endpoint730.schema.Schema730;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint730")
public class Endpoint730Resource {

    private final Service730 service;

    public Endpoint730Resource(Service730 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema730 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
