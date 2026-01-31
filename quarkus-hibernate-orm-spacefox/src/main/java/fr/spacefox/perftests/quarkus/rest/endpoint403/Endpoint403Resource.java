package fr.spacefox.perftests.quarkus.rest.endpoint403;

import fr.spacefox.perftests.quarkus.core.service403.Service403;
import fr.spacefox.perftests.quarkus.rest.endpoint403.schema.Schema403;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint403")
public class Endpoint403Resource {

    private final Service403 service;

    public Endpoint403Resource(Service403 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema403 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
