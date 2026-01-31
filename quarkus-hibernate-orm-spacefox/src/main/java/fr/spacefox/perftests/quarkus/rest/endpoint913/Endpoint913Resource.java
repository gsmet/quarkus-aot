package fr.spacefox.perftests.quarkus.rest.endpoint913;

import fr.spacefox.perftests.quarkus.core.service913.Service913;
import fr.spacefox.perftests.quarkus.rest.endpoint913.schema.Schema913;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint913")
public class Endpoint913Resource {

    private final Service913 service;

    public Endpoint913Resource(Service913 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema913 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
