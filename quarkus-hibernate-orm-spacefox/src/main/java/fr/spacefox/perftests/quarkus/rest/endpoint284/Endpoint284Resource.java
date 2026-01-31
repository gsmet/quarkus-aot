package fr.spacefox.perftests.quarkus.rest.endpoint284;

import fr.spacefox.perftests.quarkus.core.service284.Service284;
import fr.spacefox.perftests.quarkus.rest.endpoint284.schema.Schema284;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint284")
public class Endpoint284Resource {

    private final Service284 service;

    public Endpoint284Resource(Service284 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema284 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
