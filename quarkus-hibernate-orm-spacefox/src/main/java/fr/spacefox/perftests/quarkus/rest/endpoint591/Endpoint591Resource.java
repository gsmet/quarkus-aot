package fr.spacefox.perftests.quarkus.rest.endpoint591;

import fr.spacefox.perftests.quarkus.core.service591.Service591;
import fr.spacefox.perftests.quarkus.rest.endpoint591.schema.Schema591;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint591")
public class Endpoint591Resource {

    private final Service591 service;

    public Endpoint591Resource(Service591 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema591 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
