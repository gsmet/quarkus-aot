package fr.spacefox.perftests.quarkus.rest.endpoint497;

import fr.spacefox.perftests.quarkus.core.service497.Service497;
import fr.spacefox.perftests.quarkus.rest.endpoint497.schema.Schema497;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint497")
public class Endpoint497Resource {

    private final Service497 service;

    public Endpoint497Resource(Service497 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema497 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
