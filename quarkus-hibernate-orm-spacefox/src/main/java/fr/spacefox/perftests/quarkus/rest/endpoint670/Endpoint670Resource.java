package fr.spacefox.perftests.quarkus.rest.endpoint670;

import fr.spacefox.perftests.quarkus.core.service670.Service670;
import fr.spacefox.perftests.quarkus.rest.endpoint670.schema.Schema670;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint670")
public class Endpoint670Resource {

    private final Service670 service;

    public Endpoint670Resource(Service670 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema670 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
