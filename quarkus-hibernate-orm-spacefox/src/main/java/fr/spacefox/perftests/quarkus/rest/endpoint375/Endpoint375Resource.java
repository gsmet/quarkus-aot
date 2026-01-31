package fr.spacefox.perftests.quarkus.rest.endpoint375;

import fr.spacefox.perftests.quarkus.core.service375.Service375;
import fr.spacefox.perftests.quarkus.rest.endpoint375.schema.Schema375;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint375")
public class Endpoint375Resource {

    private final Service375 service;

    public Endpoint375Resource(Service375 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema375 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
