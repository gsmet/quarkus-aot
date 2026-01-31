package fr.spacefox.perftests.quarkus.rest.endpoint429;

import fr.spacefox.perftests.quarkus.core.service429.Service429;
import fr.spacefox.perftests.quarkus.rest.endpoint429.schema.Schema429;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint429")
public class Endpoint429Resource {

    private final Service429 service;

    public Endpoint429Resource(Service429 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema429 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
