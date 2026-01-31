package fr.spacefox.perftests.quarkus.rest.endpoint147;

import fr.spacefox.perftests.quarkus.core.service147.Service147;
import fr.spacefox.perftests.quarkus.rest.endpoint147.schema.Schema147;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint147")
public class Endpoint147Resource {

    private final Service147 service;

    public Endpoint147Resource(Service147 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema147 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
