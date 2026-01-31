package fr.spacefox.perftests.quarkus.rest.endpoint800;

import fr.spacefox.perftests.quarkus.core.service800.Service800;
import fr.spacefox.perftests.quarkus.rest.endpoint800.schema.Schema800;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint800")
public class Endpoint800Resource {

    private final Service800 service;

    public Endpoint800Resource(Service800 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema800 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
