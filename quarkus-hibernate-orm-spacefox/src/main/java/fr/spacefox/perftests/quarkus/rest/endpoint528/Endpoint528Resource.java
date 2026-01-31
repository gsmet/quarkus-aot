package fr.spacefox.perftests.quarkus.rest.endpoint528;

import fr.spacefox.perftests.quarkus.core.service528.Service528;
import fr.spacefox.perftests.quarkus.rest.endpoint528.schema.Schema528;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint528")
public class Endpoint528Resource {

    private final Service528 service;

    public Endpoint528Resource(Service528 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema528 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
