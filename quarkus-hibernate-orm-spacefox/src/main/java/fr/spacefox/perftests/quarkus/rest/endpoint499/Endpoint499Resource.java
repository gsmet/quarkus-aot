package fr.spacefox.perftests.quarkus.rest.endpoint499;

import fr.spacefox.perftests.quarkus.core.service499.Service499;
import fr.spacefox.perftests.quarkus.rest.endpoint499.schema.Schema499;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint499")
public class Endpoint499Resource {

    private final Service499 service;

    public Endpoint499Resource(Service499 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema499 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
