package fr.spacefox.perftests.quarkus.rest.endpoint595;

import fr.spacefox.perftests.quarkus.core.service595.Service595;
import fr.spacefox.perftests.quarkus.rest.endpoint595.schema.Schema595;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint595")
public class Endpoint595Resource {

    private final Service595 service;

    public Endpoint595Resource(Service595 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema595 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
