package fr.spacefox.perftests.quarkus.rest.endpoint50;

import fr.spacefox.perftests.quarkus.core.service50.Service50;
import fr.spacefox.perftests.quarkus.rest.endpoint50.schema.Schema50;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint50")
public class Endpoint50Resource {

    private final Service50 service;

    public Endpoint50Resource(Service50 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema50 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
