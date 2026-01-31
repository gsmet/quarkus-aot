package fr.spacefox.perftests.quarkus.rest.endpoint923;

import fr.spacefox.perftests.quarkus.core.service923.Service923;
import fr.spacefox.perftests.quarkus.rest.endpoint923.schema.Schema923;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint923")
public class Endpoint923Resource {

    private final Service923 service;

    public Endpoint923Resource(Service923 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema923 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
