package fr.spacefox.perftests.quarkus.rest.endpoint739;

import fr.spacefox.perftests.quarkus.core.service739.Service739;
import fr.spacefox.perftests.quarkus.rest.endpoint739.schema.Schema739;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint739")
public class Endpoint739Resource {

    private final Service739 service;

    public Endpoint739Resource(Service739 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema739 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
