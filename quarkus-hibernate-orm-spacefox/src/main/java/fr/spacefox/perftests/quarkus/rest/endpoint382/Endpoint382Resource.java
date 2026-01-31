package fr.spacefox.perftests.quarkus.rest.endpoint382;

import fr.spacefox.perftests.quarkus.core.service382.Service382;
import fr.spacefox.perftests.quarkus.rest.endpoint382.schema.Schema382;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint382")
public class Endpoint382Resource {

    private final Service382 service;

    public Endpoint382Resource(Service382 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema382 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
