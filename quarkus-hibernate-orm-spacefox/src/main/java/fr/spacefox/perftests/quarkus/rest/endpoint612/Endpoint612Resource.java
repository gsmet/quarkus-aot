package fr.spacefox.perftests.quarkus.rest.endpoint612;

import fr.spacefox.perftests.quarkus.core.service612.Service612;
import fr.spacefox.perftests.quarkus.rest.endpoint612.schema.Schema612;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint612")
public class Endpoint612Resource {

    private final Service612 service;

    public Endpoint612Resource(Service612 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema612 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
