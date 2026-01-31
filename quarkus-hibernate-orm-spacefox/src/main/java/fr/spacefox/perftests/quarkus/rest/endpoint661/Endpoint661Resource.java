package fr.spacefox.perftests.quarkus.rest.endpoint661;

import fr.spacefox.perftests.quarkus.core.service661.Service661;
import fr.spacefox.perftests.quarkus.rest.endpoint661.schema.Schema661;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint661")
public class Endpoint661Resource {

    private final Service661 service;

    public Endpoint661Resource(Service661 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema661 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
