package fr.spacefox.perftests.quarkus.rest.endpoint78;

import fr.spacefox.perftests.quarkus.core.service78.Service78;
import fr.spacefox.perftests.quarkus.rest.endpoint78.schema.Schema78;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint78")
public class Endpoint78Resource {

    private final Service78 service;

    public Endpoint78Resource(Service78 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema78 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
