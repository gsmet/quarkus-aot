package fr.spacefox.perftests.quarkus.rest.endpoint267;

import fr.spacefox.perftests.quarkus.core.service267.Service267;
import fr.spacefox.perftests.quarkus.rest.endpoint267.schema.Schema267;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint267")
public class Endpoint267Resource {

    private final Service267 service;

    public Endpoint267Resource(Service267 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema267 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
