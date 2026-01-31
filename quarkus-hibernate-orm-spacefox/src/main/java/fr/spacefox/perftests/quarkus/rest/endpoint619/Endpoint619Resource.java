package fr.spacefox.perftests.quarkus.rest.endpoint619;

import fr.spacefox.perftests.quarkus.core.service619.Service619;
import fr.spacefox.perftests.quarkus.rest.endpoint619.schema.Schema619;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint619")
public class Endpoint619Resource {

    private final Service619 service;

    public Endpoint619Resource(Service619 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema619 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
