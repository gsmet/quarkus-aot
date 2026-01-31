package fr.spacefox.perftests.quarkus.rest.endpoint625;

import fr.spacefox.perftests.quarkus.core.service625.Service625;
import fr.spacefox.perftests.quarkus.rest.endpoint625.schema.Schema625;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint625")
public class Endpoint625Resource {

    private final Service625 service;

    public Endpoint625Resource(Service625 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema625 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
