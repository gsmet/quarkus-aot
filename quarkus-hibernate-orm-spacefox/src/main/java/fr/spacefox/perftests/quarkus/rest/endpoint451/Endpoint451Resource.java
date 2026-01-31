package fr.spacefox.perftests.quarkus.rest.endpoint451;

import fr.spacefox.perftests.quarkus.core.service451.Service451;
import fr.spacefox.perftests.quarkus.rest.endpoint451.schema.Schema451;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint451")
public class Endpoint451Resource {

    private final Service451 service;

    public Endpoint451Resource(Service451 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema451 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
