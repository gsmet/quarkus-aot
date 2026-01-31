package fr.spacefox.perftests.quarkus.rest.endpoint217;

import fr.spacefox.perftests.quarkus.core.service217.Service217;
import fr.spacefox.perftests.quarkus.rest.endpoint217.schema.Schema217;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint217")
public class Endpoint217Resource {

    private final Service217 service;

    public Endpoint217Resource(Service217 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema217 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
