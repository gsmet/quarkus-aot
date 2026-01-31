package fr.spacefox.perftests.quarkus.rest.endpoint421;

import fr.spacefox.perftests.quarkus.core.service421.Service421;
import fr.spacefox.perftests.quarkus.rest.endpoint421.schema.Schema421;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint421")
public class Endpoint421Resource {

    private final Service421 service;

    public Endpoint421Resource(Service421 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema421 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
