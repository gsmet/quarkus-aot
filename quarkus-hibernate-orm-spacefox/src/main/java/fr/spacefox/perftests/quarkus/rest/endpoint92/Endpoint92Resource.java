package fr.spacefox.perftests.quarkus.rest.endpoint92;

import fr.spacefox.perftests.quarkus.core.service92.Service92;
import fr.spacefox.perftests.quarkus.rest.endpoint92.schema.Schema92;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint92")
public class Endpoint92Resource {

    private final Service92 service;

    public Endpoint92Resource(Service92 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema92 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
