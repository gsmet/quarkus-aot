package fr.spacefox.perftests.quarkus.rest.endpoint96;

import fr.spacefox.perftests.quarkus.core.service96.Service96;
import fr.spacefox.perftests.quarkus.rest.endpoint96.schema.Schema96;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint96")
public class Endpoint96Resource {

    private final Service96 service;

    public Endpoint96Resource(Service96 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema96 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
