package fr.spacefox.perftests.quarkus.rest.endpoint788;

import fr.spacefox.perftests.quarkus.core.service788.Service788;
import fr.spacefox.perftests.quarkus.rest.endpoint788.schema.Schema788;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint788")
public class Endpoint788Resource {

    private final Service788 service;

    public Endpoint788Resource(Service788 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema788 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
