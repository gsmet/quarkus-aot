package fr.spacefox.perftests.quarkus.rest.endpoint510;

import fr.spacefox.perftests.quarkus.core.service510.Service510;
import fr.spacefox.perftests.quarkus.rest.endpoint510.schema.Schema510;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint510")
public class Endpoint510Resource {

    private final Service510 service;

    public Endpoint510Resource(Service510 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema510 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
