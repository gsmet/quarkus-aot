package fr.spacefox.perftests.quarkus.rest.endpoint61;

import fr.spacefox.perftests.quarkus.core.service61.Service61;
import fr.spacefox.perftests.quarkus.rest.endpoint61.schema.Schema61;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint61")
public class Endpoint61Resource {

    private final Service61 service;

    public Endpoint61Resource(Service61 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema61 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
