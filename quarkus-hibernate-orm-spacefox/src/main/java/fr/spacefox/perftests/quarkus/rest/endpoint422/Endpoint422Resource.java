package fr.spacefox.perftests.quarkus.rest.endpoint422;

import fr.spacefox.perftests.quarkus.core.service422.Service422;
import fr.spacefox.perftests.quarkus.rest.endpoint422.schema.Schema422;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint422")
public class Endpoint422Resource {

    private final Service422 service;

    public Endpoint422Resource(Service422 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema422 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
