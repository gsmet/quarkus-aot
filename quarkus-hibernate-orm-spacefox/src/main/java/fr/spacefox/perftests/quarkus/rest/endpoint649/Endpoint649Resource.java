package fr.spacefox.perftests.quarkus.rest.endpoint649;

import fr.spacefox.perftests.quarkus.core.service649.Service649;
import fr.spacefox.perftests.quarkus.rest.endpoint649.schema.Schema649;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint649")
public class Endpoint649Resource {

    private final Service649 service;

    public Endpoint649Resource(Service649 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema649 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
