package fr.spacefox.perftests.quarkus.rest.endpoint381;

import fr.spacefox.perftests.quarkus.core.service381.Service381;
import fr.spacefox.perftests.quarkus.rest.endpoint381.schema.Schema381;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint381")
public class Endpoint381Resource {

    private final Service381 service;

    public Endpoint381Resource(Service381 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema381 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
