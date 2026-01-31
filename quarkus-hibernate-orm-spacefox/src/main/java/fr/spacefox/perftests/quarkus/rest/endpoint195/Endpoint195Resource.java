package fr.spacefox.perftests.quarkus.rest.endpoint195;

import fr.spacefox.perftests.quarkus.core.service195.Service195;
import fr.spacefox.perftests.quarkus.rest.endpoint195.schema.Schema195;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint195")
public class Endpoint195Resource {

    private final Service195 service;

    public Endpoint195Resource(Service195 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema195 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
