package fr.spacefox.perftests.quarkus.rest.endpoint801;

import fr.spacefox.perftests.quarkus.core.service801.Service801;
import fr.spacefox.perftests.quarkus.rest.endpoint801.schema.Schema801;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint801")
public class Endpoint801Resource {

    private final Service801 service;

    public Endpoint801Resource(Service801 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema801 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
