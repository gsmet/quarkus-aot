package fr.spacefox.perftests.quarkus.rest.endpoint430;

import fr.spacefox.perftests.quarkus.core.service430.Service430;
import fr.spacefox.perftests.quarkus.rest.endpoint430.schema.Schema430;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint430")
public class Endpoint430Resource {

    private final Service430 service;

    public Endpoint430Resource(Service430 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema430 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
