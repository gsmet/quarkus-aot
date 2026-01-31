package fr.spacefox.perftests.quarkus.rest.endpoint245;

import fr.spacefox.perftests.quarkus.core.service245.Service245;
import fr.spacefox.perftests.quarkus.rest.endpoint245.schema.Schema245;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint245")
public class Endpoint245Resource {

    private final Service245 service;

    public Endpoint245Resource(Service245 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema245 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
