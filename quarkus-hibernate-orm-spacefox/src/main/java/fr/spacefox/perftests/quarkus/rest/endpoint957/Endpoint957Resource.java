package fr.spacefox.perftests.quarkus.rest.endpoint957;

import fr.spacefox.perftests.quarkus.core.service957.Service957;
import fr.spacefox.perftests.quarkus.rest.endpoint957.schema.Schema957;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint957")
public class Endpoint957Resource {

    private final Service957 service;

    public Endpoint957Resource(Service957 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema957 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
