package fr.spacefox.perftests.quarkus.rest.endpoint212;

import fr.spacefox.perftests.quarkus.core.service212.Service212;
import fr.spacefox.perftests.quarkus.rest.endpoint212.schema.Schema212;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint212")
public class Endpoint212Resource {

    private final Service212 service;

    public Endpoint212Resource(Service212 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema212 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
