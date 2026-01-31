package fr.spacefox.perftests.quarkus.rest.endpoint519;

import fr.spacefox.perftests.quarkus.core.service519.Service519;
import fr.spacefox.perftests.quarkus.rest.endpoint519.schema.Schema519;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint519")
public class Endpoint519Resource {

    private final Service519 service;

    public Endpoint519Resource(Service519 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema519 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
