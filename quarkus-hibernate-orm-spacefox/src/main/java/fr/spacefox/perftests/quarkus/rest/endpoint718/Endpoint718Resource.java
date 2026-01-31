package fr.spacefox.perftests.quarkus.rest.endpoint718;

import fr.spacefox.perftests.quarkus.core.service718.Service718;
import fr.spacefox.perftests.quarkus.rest.endpoint718.schema.Schema718;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint718")
public class Endpoint718Resource {

    private final Service718 service;

    public Endpoint718Resource(Service718 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema718 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
