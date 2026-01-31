package fr.spacefox.perftests.quarkus.rest.endpoint341;

import fr.spacefox.perftests.quarkus.core.service341.Service341;
import fr.spacefox.perftests.quarkus.rest.endpoint341.schema.Schema341;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint341")
public class Endpoint341Resource {

    private final Service341 service;

    public Endpoint341Resource(Service341 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema341 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
