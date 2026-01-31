package fr.spacefox.perftests.quarkus.rest.endpoint208;

import fr.spacefox.perftests.quarkus.core.service208.Service208;
import fr.spacefox.perftests.quarkus.rest.endpoint208.schema.Schema208;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint208")
public class Endpoint208Resource {

    private final Service208 service;

    public Endpoint208Resource(Service208 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema208 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
