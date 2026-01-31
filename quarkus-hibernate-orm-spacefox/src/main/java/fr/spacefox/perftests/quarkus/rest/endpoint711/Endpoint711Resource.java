package fr.spacefox.perftests.quarkus.rest.endpoint711;

import fr.spacefox.perftests.quarkus.core.service711.Service711;
import fr.spacefox.perftests.quarkus.rest.endpoint711.schema.Schema711;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint711")
public class Endpoint711Resource {

    private final Service711 service;

    public Endpoint711Resource(Service711 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema711 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
