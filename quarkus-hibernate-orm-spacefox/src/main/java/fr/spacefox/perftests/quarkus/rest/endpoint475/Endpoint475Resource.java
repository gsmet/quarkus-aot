package fr.spacefox.perftests.quarkus.rest.endpoint475;

import fr.spacefox.perftests.quarkus.core.service475.Service475;
import fr.spacefox.perftests.quarkus.rest.endpoint475.schema.Schema475;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint475")
public class Endpoint475Resource {

    private final Service475 service;

    public Endpoint475Resource(Service475 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema475 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
