package fr.spacefox.perftests.quarkus.rest.endpoint268;

import fr.spacefox.perftests.quarkus.core.service268.Service268;
import fr.spacefox.perftests.quarkus.rest.endpoint268.schema.Schema268;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint268")
public class Endpoint268Resource {

    private final Service268 service;

    public Endpoint268Resource(Service268 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema268 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
