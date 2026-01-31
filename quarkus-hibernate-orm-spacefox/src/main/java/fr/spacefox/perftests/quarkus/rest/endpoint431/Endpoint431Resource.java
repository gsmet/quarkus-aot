package fr.spacefox.perftests.quarkus.rest.endpoint431;

import fr.spacefox.perftests.quarkus.core.service431.Service431;
import fr.spacefox.perftests.quarkus.rest.endpoint431.schema.Schema431;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint431")
public class Endpoint431Resource {

    private final Service431 service;

    public Endpoint431Resource(Service431 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema431 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
