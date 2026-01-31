package fr.spacefox.perftests.quarkus.rest.endpoint998;

import fr.spacefox.perftests.quarkus.core.service998.Service998;
import fr.spacefox.perftests.quarkus.rest.endpoint998.schema.Schema998;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint998")
public class Endpoint998Resource {

    private final Service998 service;

    public Endpoint998Resource(Service998 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema998 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
