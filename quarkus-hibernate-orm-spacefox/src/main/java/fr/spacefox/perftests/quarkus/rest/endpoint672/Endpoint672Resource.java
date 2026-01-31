package fr.spacefox.perftests.quarkus.rest.endpoint672;

import fr.spacefox.perftests.quarkus.core.service672.Service672;
import fr.spacefox.perftests.quarkus.rest.endpoint672.schema.Schema672;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint672")
public class Endpoint672Resource {

    private final Service672 service;

    public Endpoint672Resource(Service672 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema672 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
