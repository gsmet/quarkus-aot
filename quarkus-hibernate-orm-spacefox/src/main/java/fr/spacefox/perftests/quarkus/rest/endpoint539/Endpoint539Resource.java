package fr.spacefox.perftests.quarkus.rest.endpoint539;

import fr.spacefox.perftests.quarkus.core.service539.Service539;
import fr.spacefox.perftests.quarkus.rest.endpoint539.schema.Schema539;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint539")
public class Endpoint539Resource {

    private final Service539 service;

    public Endpoint539Resource(Service539 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema539 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
