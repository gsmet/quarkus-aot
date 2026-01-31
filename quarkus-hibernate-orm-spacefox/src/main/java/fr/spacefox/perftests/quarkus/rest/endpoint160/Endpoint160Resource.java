package fr.spacefox.perftests.quarkus.rest.endpoint160;

import fr.spacefox.perftests.quarkus.core.service160.Service160;
import fr.spacefox.perftests.quarkus.rest.endpoint160.schema.Schema160;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint160")
public class Endpoint160Resource {

    private final Service160 service;

    public Endpoint160Resource(Service160 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema160 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
