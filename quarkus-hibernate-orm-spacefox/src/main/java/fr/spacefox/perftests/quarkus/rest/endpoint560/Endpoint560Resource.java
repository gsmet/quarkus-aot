package fr.spacefox.perftests.quarkus.rest.endpoint560;

import fr.spacefox.perftests.quarkus.core.service560.Service560;
import fr.spacefox.perftests.quarkus.rest.endpoint560.schema.Schema560;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint560")
public class Endpoint560Resource {

    private final Service560 service;

    public Endpoint560Resource(Service560 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema560 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
