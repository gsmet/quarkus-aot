package fr.spacefox.perftests.quarkus.rest.endpoint526;

import fr.spacefox.perftests.quarkus.core.service526.Service526;
import fr.spacefox.perftests.quarkus.rest.endpoint526.schema.Schema526;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint526")
public class Endpoint526Resource {

    private final Service526 service;

    public Endpoint526Resource(Service526 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema526 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
