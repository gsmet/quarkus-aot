package fr.spacefox.perftests.quarkus.rest.endpoint413;

import fr.spacefox.perftests.quarkus.core.service413.Service413;
import fr.spacefox.perftests.quarkus.rest.endpoint413.schema.Schema413;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint413")
public class Endpoint413Resource {

    private final Service413 service;

    public Endpoint413Resource(Service413 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema413 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
