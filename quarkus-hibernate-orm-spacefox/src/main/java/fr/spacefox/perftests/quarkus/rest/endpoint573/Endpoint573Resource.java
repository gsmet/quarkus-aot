package fr.spacefox.perftests.quarkus.rest.endpoint573;

import fr.spacefox.perftests.quarkus.core.service573.Service573;
import fr.spacefox.perftests.quarkus.rest.endpoint573.schema.Schema573;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint573")
public class Endpoint573Resource {

    private final Service573 service;

    public Endpoint573Resource(Service573 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema573 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
