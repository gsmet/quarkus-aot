package fr.spacefox.perftests.quarkus.rest.endpoint566;

import fr.spacefox.perftests.quarkus.core.service566.Service566;
import fr.spacefox.perftests.quarkus.rest.endpoint566.schema.Schema566;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint566")
public class Endpoint566Resource {

    private final Service566 service;

    public Endpoint566Resource(Service566 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema566 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
