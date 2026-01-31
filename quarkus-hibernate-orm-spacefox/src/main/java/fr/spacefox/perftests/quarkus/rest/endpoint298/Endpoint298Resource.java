package fr.spacefox.perftests.quarkus.rest.endpoint298;

import fr.spacefox.perftests.quarkus.core.service298.Service298;
import fr.spacefox.perftests.quarkus.rest.endpoint298.schema.Schema298;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint298")
public class Endpoint298Resource {

    private final Service298 service;

    public Endpoint298Resource(Service298 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema298 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
