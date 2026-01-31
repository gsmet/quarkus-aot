package fr.spacefox.perftests.quarkus.rest.endpoint385;

import fr.spacefox.perftests.quarkus.core.service385.Service385;
import fr.spacefox.perftests.quarkus.rest.endpoint385.schema.Schema385;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint385")
public class Endpoint385Resource {

    private final Service385 service;

    public Endpoint385Resource(Service385 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema385 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
