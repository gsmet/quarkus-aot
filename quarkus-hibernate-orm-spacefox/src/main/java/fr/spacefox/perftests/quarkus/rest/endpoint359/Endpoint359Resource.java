package fr.spacefox.perftests.quarkus.rest.endpoint359;

import fr.spacefox.perftests.quarkus.core.service359.Service359;
import fr.spacefox.perftests.quarkus.rest.endpoint359.schema.Schema359;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint359")
public class Endpoint359Resource {

    private final Service359 service;

    public Endpoint359Resource(Service359 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema359 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
