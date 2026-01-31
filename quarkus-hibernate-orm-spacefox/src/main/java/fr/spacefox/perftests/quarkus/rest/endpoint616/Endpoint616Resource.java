package fr.spacefox.perftests.quarkus.rest.endpoint616;

import fr.spacefox.perftests.quarkus.core.service616.Service616;
import fr.spacefox.perftests.quarkus.rest.endpoint616.schema.Schema616;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint616")
public class Endpoint616Resource {

    private final Service616 service;

    public Endpoint616Resource(Service616 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema616 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
