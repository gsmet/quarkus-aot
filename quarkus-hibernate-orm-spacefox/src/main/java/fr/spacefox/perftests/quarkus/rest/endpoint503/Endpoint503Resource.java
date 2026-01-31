package fr.spacefox.perftests.quarkus.rest.endpoint503;

import fr.spacefox.perftests.quarkus.core.service503.Service503;
import fr.spacefox.perftests.quarkus.rest.endpoint503.schema.Schema503;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint503")
public class Endpoint503Resource {

    private final Service503 service;

    public Endpoint503Resource(Service503 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema503 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
