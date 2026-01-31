package fr.spacefox.perftests.quarkus.rest.endpoint13;

import fr.spacefox.perftests.quarkus.core.service13.Service13;
import fr.spacefox.perftests.quarkus.rest.endpoint13.schema.Schema13;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint13")
public class Endpoint13Resource {

    private final Service13 service;

    public Endpoint13Resource(Service13 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema13 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
