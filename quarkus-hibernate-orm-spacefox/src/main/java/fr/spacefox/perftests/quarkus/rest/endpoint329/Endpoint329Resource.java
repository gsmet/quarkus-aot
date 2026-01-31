package fr.spacefox.perftests.quarkus.rest.endpoint329;

import fr.spacefox.perftests.quarkus.core.service329.Service329;
import fr.spacefox.perftests.quarkus.rest.endpoint329.schema.Schema329;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint329")
public class Endpoint329Resource {

    private final Service329 service;

    public Endpoint329Resource(Service329 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema329 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
