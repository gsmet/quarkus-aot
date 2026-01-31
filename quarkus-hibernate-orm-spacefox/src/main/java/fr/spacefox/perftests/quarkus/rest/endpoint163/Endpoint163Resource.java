package fr.spacefox.perftests.quarkus.rest.endpoint163;

import fr.spacefox.perftests.quarkus.core.service163.Service163;
import fr.spacefox.perftests.quarkus.rest.endpoint163.schema.Schema163;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint163")
public class Endpoint163Resource {

    private final Service163 service;

    public Endpoint163Resource(Service163 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema163 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
