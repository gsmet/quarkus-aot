package fr.spacefox.perftests.quarkus.rest.endpoint933;

import fr.spacefox.perftests.quarkus.core.service933.Service933;
import fr.spacefox.perftests.quarkus.rest.endpoint933.schema.Schema933;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint933")
public class Endpoint933Resource {

    private final Service933 service;

    public Endpoint933Resource(Service933 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema933 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
