package fr.spacefox.perftests.quarkus.rest.endpoint88;

import fr.spacefox.perftests.quarkus.core.service88.Service88;
import fr.spacefox.perftests.quarkus.rest.endpoint88.schema.Schema88;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint88")
public class Endpoint88Resource {

    private final Service88 service;

    public Endpoint88Resource(Service88 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema88 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
