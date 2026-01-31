package fr.spacefox.perftests.quarkus.rest.endpoint82;

import fr.spacefox.perftests.quarkus.core.service82.Service82;
import fr.spacefox.perftests.quarkus.rest.endpoint82.schema.Schema82;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint82")
public class Endpoint82Resource {

    private final Service82 service;

    public Endpoint82Resource(Service82 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema82 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
