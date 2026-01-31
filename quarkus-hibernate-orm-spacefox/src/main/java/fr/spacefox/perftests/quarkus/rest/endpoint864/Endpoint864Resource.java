package fr.spacefox.perftests.quarkus.rest.endpoint864;

import fr.spacefox.perftests.quarkus.core.service864.Service864;
import fr.spacefox.perftests.quarkus.rest.endpoint864.schema.Schema864;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint864")
public class Endpoint864Resource {

    private final Service864 service;

    public Endpoint864Resource(Service864 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema864 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
