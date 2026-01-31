package fr.spacefox.perftests.quarkus.rest.endpoint787;

import fr.spacefox.perftests.quarkus.core.service787.Service787;
import fr.spacefox.perftests.quarkus.rest.endpoint787.schema.Schema787;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint787")
public class Endpoint787Resource {

    private final Service787 service;

    public Endpoint787Resource(Service787 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema787 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
