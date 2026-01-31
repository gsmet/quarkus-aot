package fr.spacefox.perftests.quarkus.rest.endpoint696;

import fr.spacefox.perftests.quarkus.core.service696.Service696;
import fr.spacefox.perftests.quarkus.rest.endpoint696.schema.Schema696;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint696")
public class Endpoint696Resource {

    private final Service696 service;

    public Endpoint696Resource(Service696 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema696 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
