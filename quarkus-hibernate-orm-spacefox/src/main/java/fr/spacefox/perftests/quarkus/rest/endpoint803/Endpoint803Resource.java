package fr.spacefox.perftests.quarkus.rest.endpoint803;

import fr.spacefox.perftests.quarkus.core.service803.Service803;
import fr.spacefox.perftests.quarkus.rest.endpoint803.schema.Schema803;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint803")
public class Endpoint803Resource {

    private final Service803 service;

    public Endpoint803Resource(Service803 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema803 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
