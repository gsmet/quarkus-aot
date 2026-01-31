package fr.spacefox.perftests.quarkus.rest.endpoint376;

import fr.spacefox.perftests.quarkus.core.service376.Service376;
import fr.spacefox.perftests.quarkus.rest.endpoint376.schema.Schema376;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint376")
public class Endpoint376Resource {

    private final Service376 service;

    public Endpoint376Resource(Service376 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema376 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
