package fr.spacefox.perftests.quarkus.rest.endpoint962;

import fr.spacefox.perftests.quarkus.core.service962.Service962;
import fr.spacefox.perftests.quarkus.rest.endpoint962.schema.Schema962;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint962")
public class Endpoint962Resource {

    private final Service962 service;

    public Endpoint962Resource(Service962 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema962 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
