package fr.spacefox.perftests.quarkus.rest.endpoint265;

import fr.spacefox.perftests.quarkus.core.service265.Service265;
import fr.spacefox.perftests.quarkus.rest.endpoint265.schema.Schema265;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint265")
public class Endpoint265Resource {

    private final Service265 service;

    public Endpoint265Resource(Service265 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema265 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
