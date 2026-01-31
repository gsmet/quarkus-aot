package fr.spacefox.perftests.quarkus.rest.endpoint58;

import fr.spacefox.perftests.quarkus.core.service58.Service58;
import fr.spacefox.perftests.quarkus.rest.endpoint58.schema.Schema58;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint58")
public class Endpoint58Resource {

    private final Service58 service;

    public Endpoint58Resource(Service58 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema58 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
