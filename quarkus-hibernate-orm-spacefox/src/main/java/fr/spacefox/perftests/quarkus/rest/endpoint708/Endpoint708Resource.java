package fr.spacefox.perftests.quarkus.rest.endpoint708;

import fr.spacefox.perftests.quarkus.core.service708.Service708;
import fr.spacefox.perftests.quarkus.rest.endpoint708.schema.Schema708;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint708")
public class Endpoint708Resource {

    private final Service708 service;

    public Endpoint708Resource(Service708 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema708 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
