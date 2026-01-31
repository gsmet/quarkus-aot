package fr.spacefox.perftests.quarkus.rest.endpoint282;

import fr.spacefox.perftests.quarkus.core.service282.Service282;
import fr.spacefox.perftests.quarkus.rest.endpoint282.schema.Schema282;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint282")
public class Endpoint282Resource {

    private final Service282 service;

    public Endpoint282Resource(Service282 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema282 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
