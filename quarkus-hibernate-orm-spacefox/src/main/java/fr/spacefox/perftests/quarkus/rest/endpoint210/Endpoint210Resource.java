package fr.spacefox.perftests.quarkus.rest.endpoint210;

import fr.spacefox.perftests.quarkus.core.service210.Service210;
import fr.spacefox.perftests.quarkus.rest.endpoint210.schema.Schema210;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint210")
public class Endpoint210Resource {

    private final Service210 service;

    public Endpoint210Resource(Service210 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema210 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
