package fr.spacefox.perftests.quarkus.rest.endpoint477;

import fr.spacefox.perftests.quarkus.core.service477.Service477;
import fr.spacefox.perftests.quarkus.rest.endpoint477.schema.Schema477;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint477")
public class Endpoint477Resource {

    private final Service477 service;

    public Endpoint477Resource(Service477 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema477 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
