package fr.spacefox.perftests.quarkus.rest.endpoint414;

import fr.spacefox.perftests.quarkus.core.service414.Service414;
import fr.spacefox.perftests.quarkus.rest.endpoint414.schema.Schema414;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint414")
public class Endpoint414Resource {

    private final Service414 service;

    public Endpoint414Resource(Service414 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema414 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
