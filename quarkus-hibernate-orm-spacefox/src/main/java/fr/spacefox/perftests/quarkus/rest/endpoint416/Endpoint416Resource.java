package fr.spacefox.perftests.quarkus.rest.endpoint416;

import fr.spacefox.perftests.quarkus.core.service416.Service416;
import fr.spacefox.perftests.quarkus.rest.endpoint416.schema.Schema416;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint416")
public class Endpoint416Resource {

    private final Service416 service;

    public Endpoint416Resource(Service416 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema416 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
