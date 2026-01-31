package fr.spacefox.perftests.quarkus.rest.endpoint500;

import fr.spacefox.perftests.quarkus.core.service500.Service500;
import fr.spacefox.perftests.quarkus.rest.endpoint500.schema.Schema500;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint500")
public class Endpoint500Resource {

    private final Service500 service;

    public Endpoint500Resource(Service500 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema500 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
