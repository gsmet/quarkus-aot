package fr.spacefox.perftests.quarkus.rest.endpoint824;

import fr.spacefox.perftests.quarkus.core.service824.Service824;
import fr.spacefox.perftests.quarkus.rest.endpoint824.schema.Schema824;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint824")
public class Endpoint824Resource {

    private final Service824 service;

    public Endpoint824Resource(Service824 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema824 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
