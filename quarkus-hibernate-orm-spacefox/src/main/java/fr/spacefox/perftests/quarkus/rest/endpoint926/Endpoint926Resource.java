package fr.spacefox.perftests.quarkus.rest.endpoint926;

import fr.spacefox.perftests.quarkus.core.service926.Service926;
import fr.spacefox.perftests.quarkus.rest.endpoint926.schema.Schema926;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint926")
public class Endpoint926Resource {

    private final Service926 service;

    public Endpoint926Resource(Service926 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema926 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
