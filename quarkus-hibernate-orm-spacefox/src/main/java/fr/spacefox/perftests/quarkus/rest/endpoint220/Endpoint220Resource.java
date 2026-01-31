package fr.spacefox.perftests.quarkus.rest.endpoint220;

import fr.spacefox.perftests.quarkus.core.service220.Service220;
import fr.spacefox.perftests.quarkus.rest.endpoint220.schema.Schema220;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint220")
public class Endpoint220Resource {

    private final Service220 service;

    public Endpoint220Resource(Service220 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema220 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
