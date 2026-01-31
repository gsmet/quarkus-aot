package fr.spacefox.perftests.quarkus.rest.endpoint663;

import fr.spacefox.perftests.quarkus.core.service663.Service663;
import fr.spacefox.perftests.quarkus.rest.endpoint663.schema.Schema663;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint663")
public class Endpoint663Resource {

    private final Service663 service;

    public Endpoint663Resource(Service663 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema663 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
