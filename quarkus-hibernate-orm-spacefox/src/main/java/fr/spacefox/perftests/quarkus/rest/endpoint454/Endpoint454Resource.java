package fr.spacefox.perftests.quarkus.rest.endpoint454;

import fr.spacefox.perftests.quarkus.core.service454.Service454;
import fr.spacefox.perftests.quarkus.rest.endpoint454.schema.Schema454;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint454")
public class Endpoint454Resource {

    private final Service454 service;

    public Endpoint454Resource(Service454 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema454 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
