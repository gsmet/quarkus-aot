package fr.spacefox.perftests.quarkus.rest.endpoint402;

import fr.spacefox.perftests.quarkus.core.service402.Service402;
import fr.spacefox.perftests.quarkus.rest.endpoint402.schema.Schema402;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint402")
public class Endpoint402Resource {

    private final Service402 service;

    public Endpoint402Resource(Service402 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema402 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
