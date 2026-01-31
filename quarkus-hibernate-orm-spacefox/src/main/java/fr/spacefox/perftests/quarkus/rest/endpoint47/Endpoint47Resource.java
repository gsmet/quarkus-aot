package fr.spacefox.perftests.quarkus.rest.endpoint47;

import fr.spacefox.perftests.quarkus.core.service47.Service47;
import fr.spacefox.perftests.quarkus.rest.endpoint47.schema.Schema47;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint47")
public class Endpoint47Resource {

    private final Service47 service;

    public Endpoint47Resource(Service47 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema47 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
