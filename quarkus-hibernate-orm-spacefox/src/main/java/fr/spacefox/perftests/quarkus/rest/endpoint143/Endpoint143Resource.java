package fr.spacefox.perftests.quarkus.rest.endpoint143;

import fr.spacefox.perftests.quarkus.core.service143.Service143;
import fr.spacefox.perftests.quarkus.rest.endpoint143.schema.Schema143;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint143")
public class Endpoint143Resource {

    private final Service143 service;

    public Endpoint143Resource(Service143 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema143 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
