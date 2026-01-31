package fr.spacefox.perftests.quarkus.rest.endpoint400;

import fr.spacefox.perftests.quarkus.core.service400.Service400;
import fr.spacefox.perftests.quarkus.rest.endpoint400.schema.Schema400;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint400")
public class Endpoint400Resource {

    private final Service400 service;

    public Endpoint400Resource(Service400 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema400 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
