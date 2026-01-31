package fr.spacefox.perftests.quarkus.rest.endpoint183;

import fr.spacefox.perftests.quarkus.core.service183.Service183;
import fr.spacefox.perftests.quarkus.rest.endpoint183.schema.Schema183;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint183")
public class Endpoint183Resource {

    private final Service183 service;

    public Endpoint183Resource(Service183 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema183 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
