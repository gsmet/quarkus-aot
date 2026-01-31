package fr.spacefox.perftests.quarkus.rest.endpoint877;

import fr.spacefox.perftests.quarkus.core.service877.Service877;
import fr.spacefox.perftests.quarkus.rest.endpoint877.schema.Schema877;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint877")
public class Endpoint877Resource {

    private final Service877 service;

    public Endpoint877Resource(Service877 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema877 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
