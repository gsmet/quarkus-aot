package fr.spacefox.perftests.quarkus.rest.endpoint706;

import fr.spacefox.perftests.quarkus.core.service706.Service706;
import fr.spacefox.perftests.quarkus.rest.endpoint706.schema.Schema706;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint706")
public class Endpoint706Resource {

    private final Service706 service;

    public Endpoint706Resource(Service706 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema706 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
