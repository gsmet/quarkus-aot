package fr.spacefox.perftests.quarkus.rest.endpoint10;

import fr.spacefox.perftests.quarkus.core.service10.Service10;
import fr.spacefox.perftests.quarkus.rest.endpoint10.schema.Schema10;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint10")
public class Endpoint10Resource {

    private final Service10 service;

    public Endpoint10Resource(Service10 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema10 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
