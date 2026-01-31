package fr.spacefox.perftests.quarkus.rest.endpoint997;

import fr.spacefox.perftests.quarkus.core.service997.Service997;
import fr.spacefox.perftests.quarkus.rest.endpoint997.schema.Schema997;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint997")
public class Endpoint997Resource {

    private final Service997 service;

    public Endpoint997Resource(Service997 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema997 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
