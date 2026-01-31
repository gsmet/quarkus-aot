package fr.spacefox.perftests.quarkus.rest.endpoint113;

import fr.spacefox.perftests.quarkus.core.service113.Service113;
import fr.spacefox.perftests.quarkus.rest.endpoint113.schema.Schema113;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint113")
public class Endpoint113Resource {

    private final Service113 service;

    public Endpoint113Resource(Service113 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema113 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
