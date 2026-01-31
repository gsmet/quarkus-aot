package fr.spacefox.perftests.quarkus.rest.endpoint226;

import fr.spacefox.perftests.quarkus.core.service226.Service226;
import fr.spacefox.perftests.quarkus.rest.endpoint226.schema.Schema226;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint226")
public class Endpoint226Resource {

    private final Service226 service;

    public Endpoint226Resource(Service226 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema226 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
