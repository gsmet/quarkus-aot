package fr.spacefox.perftests.quarkus.rest.endpoint562;

import fr.spacefox.perftests.quarkus.core.service562.Service562;
import fr.spacefox.perftests.quarkus.rest.endpoint562.schema.Schema562;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint562")
public class Endpoint562Resource {

    private final Service562 service;

    public Endpoint562Resource(Service562 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema562 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
