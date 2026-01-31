package fr.spacefox.perftests.quarkus.rest.endpoint690;

import fr.spacefox.perftests.quarkus.core.service690.Service690;
import fr.spacefox.perftests.quarkus.rest.endpoint690.schema.Schema690;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint690")
public class Endpoint690Resource {

    private final Service690 service;

    public Endpoint690Resource(Service690 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema690 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
