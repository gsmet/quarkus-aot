package fr.spacefox.perftests.quarkus.rest.endpoint262;

import fr.spacefox.perftests.quarkus.core.service262.Service262;
import fr.spacefox.perftests.quarkus.rest.endpoint262.schema.Schema262;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint262")
public class Endpoint262Resource {

    private final Service262 service;

    public Endpoint262Resource(Service262 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema262 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
