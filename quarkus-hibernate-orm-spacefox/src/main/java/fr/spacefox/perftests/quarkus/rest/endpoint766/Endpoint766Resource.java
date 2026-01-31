package fr.spacefox.perftests.quarkus.rest.endpoint766;

import fr.spacefox.perftests.quarkus.core.service766.Service766;
import fr.spacefox.perftests.quarkus.rest.endpoint766.schema.Schema766;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint766")
public class Endpoint766Resource {

    private final Service766 service;

    public Endpoint766Resource(Service766 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema766 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
