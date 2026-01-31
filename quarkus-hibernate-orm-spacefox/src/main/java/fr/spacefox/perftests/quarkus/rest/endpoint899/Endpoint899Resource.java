package fr.spacefox.perftests.quarkus.rest.endpoint899;

import fr.spacefox.perftests.quarkus.core.service899.Service899;
import fr.spacefox.perftests.quarkus.rest.endpoint899.schema.Schema899;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint899")
public class Endpoint899Resource {

    private final Service899 service;

    public Endpoint899Resource(Service899 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema899 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
