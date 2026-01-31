package fr.spacefox.perftests.quarkus.rest.endpoint98;

import fr.spacefox.perftests.quarkus.core.service98.Service98;
import fr.spacefox.perftests.quarkus.rest.endpoint98.schema.Schema98;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint98")
public class Endpoint98Resource {

    private final Service98 service;

    public Endpoint98Resource(Service98 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema98 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
