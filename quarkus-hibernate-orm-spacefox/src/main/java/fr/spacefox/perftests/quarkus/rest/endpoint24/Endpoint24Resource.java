package fr.spacefox.perftests.quarkus.rest.endpoint24;

import fr.spacefox.perftests.quarkus.core.service24.Service24;
import fr.spacefox.perftests.quarkus.rest.endpoint24.schema.Schema24;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint24")
public class Endpoint24Resource {

    private final Service24 service;

    public Endpoint24Resource(Service24 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema24 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
