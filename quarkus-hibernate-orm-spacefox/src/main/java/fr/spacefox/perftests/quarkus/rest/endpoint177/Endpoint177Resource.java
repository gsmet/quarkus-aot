package fr.spacefox.perftests.quarkus.rest.endpoint177;

import fr.spacefox.perftests.quarkus.core.service177.Service177;
import fr.spacefox.perftests.quarkus.rest.endpoint177.schema.Schema177;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint177")
public class Endpoint177Resource {

    private final Service177 service;

    public Endpoint177Resource(Service177 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema177 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
