package fr.spacefox.perftests.quarkus.rest.endpoint559;

import fr.spacefox.perftests.quarkus.core.service559.Service559;
import fr.spacefox.perftests.quarkus.rest.endpoint559.schema.Schema559;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint559")
public class Endpoint559Resource {

    private final Service559 service;

    public Endpoint559Resource(Service559 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema559 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
