package fr.spacefox.perftests.quarkus.rest.endpoint856;

import fr.spacefox.perftests.quarkus.core.service856.Service856;
import fr.spacefox.perftests.quarkus.rest.endpoint856.schema.Schema856;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint856")
public class Endpoint856Resource {

    private final Service856 service;

    public Endpoint856Resource(Service856 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema856 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
