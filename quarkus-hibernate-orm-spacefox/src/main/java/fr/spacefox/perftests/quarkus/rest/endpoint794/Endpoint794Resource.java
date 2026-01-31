package fr.spacefox.perftests.quarkus.rest.endpoint794;

import fr.spacefox.perftests.quarkus.core.service794.Service794;
import fr.spacefox.perftests.quarkus.rest.endpoint794.schema.Schema794;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint794")
public class Endpoint794Resource {

    private final Service794 service;

    public Endpoint794Resource(Service794 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema794 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
