package fr.spacefox.perftests.quarkus.rest.endpoint838;

import fr.spacefox.perftests.quarkus.core.service838.Service838;
import fr.spacefox.perftests.quarkus.rest.endpoint838.schema.Schema838;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint838")
public class Endpoint838Resource {

    private final Service838 service;

    public Endpoint838Resource(Service838 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema838 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
