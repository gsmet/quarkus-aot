package fr.spacefox.perftests.quarkus.rest.endpoint339;

import fr.spacefox.perftests.quarkus.core.service339.Service339;
import fr.spacefox.perftests.quarkus.rest.endpoint339.schema.Schema339;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint339")
public class Endpoint339Resource {

    private final Service339 service;

    public Endpoint339Resource(Service339 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema339 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
