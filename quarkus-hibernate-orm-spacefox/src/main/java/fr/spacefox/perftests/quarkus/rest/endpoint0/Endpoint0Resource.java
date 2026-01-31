package fr.spacefox.perftests.quarkus.rest.endpoint0;

import fr.spacefox.perftests.quarkus.core.service0.Service0;
import fr.spacefox.perftests.quarkus.rest.endpoint0.schema.Schema0;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint0")
public class Endpoint0Resource {

    private final Service0 service;

    public Endpoint0Resource(Service0 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema0 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
