package fr.spacefox.perftests.quarkus.rest.endpoint235;

import fr.spacefox.perftests.quarkus.core.service235.Service235;
import fr.spacefox.perftests.quarkus.rest.endpoint235.schema.Schema235;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint235")
public class Endpoint235Resource {

    private final Service235 service;

    public Endpoint235Resource(Service235 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema235 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
