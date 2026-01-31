package fr.spacefox.perftests.quarkus.rest.endpoint42;

import fr.spacefox.perftests.quarkus.core.service42.Service42;
import fr.spacefox.perftests.quarkus.rest.endpoint42.schema.Schema42;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint42")
public class Endpoint42Resource {

    private final Service42 service;

    public Endpoint42Resource(Service42 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema42 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
