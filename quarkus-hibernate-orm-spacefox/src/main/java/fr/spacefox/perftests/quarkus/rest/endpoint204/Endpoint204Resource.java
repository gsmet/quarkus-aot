package fr.spacefox.perftests.quarkus.rest.endpoint204;

import fr.spacefox.perftests.quarkus.core.service204.Service204;
import fr.spacefox.perftests.quarkus.rest.endpoint204.schema.Schema204;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint204")
public class Endpoint204Resource {

    private final Service204 service;

    public Endpoint204Resource(Service204 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema204 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
