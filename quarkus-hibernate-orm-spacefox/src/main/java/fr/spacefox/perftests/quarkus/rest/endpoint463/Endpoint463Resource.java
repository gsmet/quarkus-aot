package fr.spacefox.perftests.quarkus.rest.endpoint463;

import fr.spacefox.perftests.quarkus.core.service463.Service463;
import fr.spacefox.perftests.quarkus.rest.endpoint463.schema.Schema463;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint463")
public class Endpoint463Resource {

    private final Service463 service;

    public Endpoint463Resource(Service463 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema463 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
