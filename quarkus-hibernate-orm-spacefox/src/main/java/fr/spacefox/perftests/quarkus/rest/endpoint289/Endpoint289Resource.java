package fr.spacefox.perftests.quarkus.rest.endpoint289;

import fr.spacefox.perftests.quarkus.core.service289.Service289;
import fr.spacefox.perftests.quarkus.rest.endpoint289.schema.Schema289;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint289")
public class Endpoint289Resource {

    private final Service289 service;

    public Endpoint289Resource(Service289 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema289 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
