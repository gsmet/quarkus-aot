package fr.spacefox.perftests.quarkus.rest.endpoint716;

import fr.spacefox.perftests.quarkus.core.service716.Service716;
import fr.spacefox.perftests.quarkus.rest.endpoint716.schema.Schema716;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint716")
public class Endpoint716Resource {

    private final Service716 service;

    public Endpoint716Resource(Service716 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema716 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
