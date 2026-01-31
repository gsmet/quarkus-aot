package fr.spacefox.perftests.quarkus.rest.endpoint599;

import fr.spacefox.perftests.quarkus.core.service599.Service599;
import fr.spacefox.perftests.quarkus.rest.endpoint599.schema.Schema599;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint599")
public class Endpoint599Resource {

    private final Service599 service;

    public Endpoint599Resource(Service599 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema599 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
