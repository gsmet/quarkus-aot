package fr.spacefox.perftests.quarkus.rest.endpoint296;

import fr.spacefox.perftests.quarkus.core.service296.Service296;
import fr.spacefox.perftests.quarkus.rest.endpoint296.schema.Schema296;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint296")
public class Endpoint296Resource {

    private final Service296 service;

    public Endpoint296Resource(Service296 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema296 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
