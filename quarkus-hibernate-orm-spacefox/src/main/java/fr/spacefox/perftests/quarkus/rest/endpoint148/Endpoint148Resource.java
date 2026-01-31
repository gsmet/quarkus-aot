package fr.spacefox.perftests.quarkus.rest.endpoint148;

import fr.spacefox.perftests.quarkus.core.service148.Service148;
import fr.spacefox.perftests.quarkus.rest.endpoint148.schema.Schema148;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint148")
public class Endpoint148Resource {

    private final Service148 service;

    public Endpoint148Resource(Service148 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema148 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
