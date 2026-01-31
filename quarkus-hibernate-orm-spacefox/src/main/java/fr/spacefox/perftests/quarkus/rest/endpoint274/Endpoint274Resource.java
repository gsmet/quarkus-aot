package fr.spacefox.perftests.quarkus.rest.endpoint274;

import fr.spacefox.perftests.quarkus.core.service274.Service274;
import fr.spacefox.perftests.quarkus.rest.endpoint274.schema.Schema274;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint274")
public class Endpoint274Resource {

    private final Service274 service;

    public Endpoint274Resource(Service274 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema274 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
