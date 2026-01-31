package fr.spacefox.perftests.quarkus.rest.endpoint20;

import fr.spacefox.perftests.quarkus.core.service20.Service20;
import fr.spacefox.perftests.quarkus.rest.endpoint20.schema.Schema20;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint20")
public class Endpoint20Resource {

    private final Service20 service;

    public Endpoint20Resource(Service20 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema20 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
