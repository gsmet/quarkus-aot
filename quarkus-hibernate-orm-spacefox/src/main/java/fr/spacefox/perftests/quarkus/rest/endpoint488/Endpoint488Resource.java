package fr.spacefox.perftests.quarkus.rest.endpoint488;

import fr.spacefox.perftests.quarkus.core.service488.Service488;
import fr.spacefox.perftests.quarkus.rest.endpoint488.schema.Schema488;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint488")
public class Endpoint488Resource {

    private final Service488 service;

    public Endpoint488Resource(Service488 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema488 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
