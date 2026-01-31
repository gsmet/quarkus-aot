package fr.spacefox.perftests.quarkus.rest.endpoint95;

import fr.spacefox.perftests.quarkus.core.service95.Service95;
import fr.spacefox.perftests.quarkus.rest.endpoint95.schema.Schema95;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint95")
public class Endpoint95Resource {

    private final Service95 service;

    public Endpoint95Resource(Service95 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema95 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
