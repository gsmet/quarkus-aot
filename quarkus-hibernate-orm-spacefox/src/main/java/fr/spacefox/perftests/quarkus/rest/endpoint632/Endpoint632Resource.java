package fr.spacefox.perftests.quarkus.rest.endpoint632;

import fr.spacefox.perftests.quarkus.core.service632.Service632;
import fr.spacefox.perftests.quarkus.rest.endpoint632.schema.Schema632;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint632")
public class Endpoint632Resource {

    private final Service632 service;

    public Endpoint632Resource(Service632 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema632 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
