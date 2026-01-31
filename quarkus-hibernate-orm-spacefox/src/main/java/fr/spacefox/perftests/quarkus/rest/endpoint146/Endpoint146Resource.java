package fr.spacefox.perftests.quarkus.rest.endpoint146;

import fr.spacefox.perftests.quarkus.core.service146.Service146;
import fr.spacefox.perftests.quarkus.rest.endpoint146.schema.Schema146;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint146")
public class Endpoint146Resource {

    private final Service146 service;

    public Endpoint146Resource(Service146 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema146 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
