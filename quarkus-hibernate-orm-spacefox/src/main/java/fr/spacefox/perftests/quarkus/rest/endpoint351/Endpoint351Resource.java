package fr.spacefox.perftests.quarkus.rest.endpoint351;

import fr.spacefox.perftests.quarkus.core.service351.Service351;
import fr.spacefox.perftests.quarkus.rest.endpoint351.schema.Schema351;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint351")
public class Endpoint351Resource {

    private final Service351 service;

    public Endpoint351Resource(Service351 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema351 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
