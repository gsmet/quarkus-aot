package fr.spacefox.perftests.quarkus.rest.endpoint290;

import fr.spacefox.perftests.quarkus.core.service290.Service290;
import fr.spacefox.perftests.quarkus.rest.endpoint290.schema.Schema290;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint290")
public class Endpoint290Resource {

    private final Service290 service;

    public Endpoint290Resource(Service290 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema290 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
