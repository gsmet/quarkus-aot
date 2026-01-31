package fr.spacefox.perftests.quarkus.rest.endpoint310;

import fr.spacefox.perftests.quarkus.core.service310.Service310;
import fr.spacefox.perftests.quarkus.rest.endpoint310.schema.Schema310;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint310")
public class Endpoint310Resource {

    private final Service310 service;

    public Endpoint310Resource(Service310 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema310 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
