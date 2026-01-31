package fr.spacefox.perftests.quarkus.rest.endpoint675;

import fr.spacefox.perftests.quarkus.core.service675.Service675;
import fr.spacefox.perftests.quarkus.rest.endpoint675.schema.Schema675;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint675")
public class Endpoint675Resource {

    private final Service675 service;

    public Endpoint675Resource(Service675 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema675 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
