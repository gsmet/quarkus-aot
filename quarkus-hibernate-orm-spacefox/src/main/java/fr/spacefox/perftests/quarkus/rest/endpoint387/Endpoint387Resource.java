package fr.spacefox.perftests.quarkus.rest.endpoint387;

import fr.spacefox.perftests.quarkus.core.service387.Service387;
import fr.spacefox.perftests.quarkus.rest.endpoint387.schema.Schema387;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint387")
public class Endpoint387Resource {

    private final Service387 service;

    public Endpoint387Resource(Service387 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema387 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
