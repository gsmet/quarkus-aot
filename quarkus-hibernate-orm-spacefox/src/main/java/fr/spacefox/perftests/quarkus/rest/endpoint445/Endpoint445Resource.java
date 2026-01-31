package fr.spacefox.perftests.quarkus.rest.endpoint445;

import fr.spacefox.perftests.quarkus.core.service445.Service445;
import fr.spacefox.perftests.quarkus.rest.endpoint445.schema.Schema445;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint445")
public class Endpoint445Resource {

    private final Service445 service;

    public Endpoint445Resource(Service445 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema445 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
