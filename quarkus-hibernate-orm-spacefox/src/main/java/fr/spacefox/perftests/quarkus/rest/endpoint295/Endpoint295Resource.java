package fr.spacefox.perftests.quarkus.rest.endpoint295;

import fr.spacefox.perftests.quarkus.core.service295.Service295;
import fr.spacefox.perftests.quarkus.rest.endpoint295.schema.Schema295;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint295")
public class Endpoint295Resource {

    private final Service295 service;

    public Endpoint295Resource(Service295 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema295 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
