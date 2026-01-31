package fr.spacefox.perftests.quarkus.rest.endpoint668;

import fr.spacefox.perftests.quarkus.core.service668.Service668;
import fr.spacefox.perftests.quarkus.rest.endpoint668.schema.Schema668;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint668")
public class Endpoint668Resource {

    private final Service668 service;

    public Endpoint668Resource(Service668 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema668 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
