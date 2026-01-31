package fr.spacefox.perftests.quarkus.rest.endpoint275;

import fr.spacefox.perftests.quarkus.core.service275.Service275;
import fr.spacefox.perftests.quarkus.rest.endpoint275.schema.Schema275;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint275")
public class Endpoint275Resource {

    private final Service275 service;

    public Endpoint275Resource(Service275 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema275 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
