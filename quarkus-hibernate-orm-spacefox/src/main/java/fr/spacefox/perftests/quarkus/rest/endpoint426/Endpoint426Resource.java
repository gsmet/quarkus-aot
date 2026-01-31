package fr.spacefox.perftests.quarkus.rest.endpoint426;

import fr.spacefox.perftests.quarkus.core.service426.Service426;
import fr.spacefox.perftests.quarkus.rest.endpoint426.schema.Schema426;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint426")
public class Endpoint426Resource {

    private final Service426 service;

    public Endpoint426Resource(Service426 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema426 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
