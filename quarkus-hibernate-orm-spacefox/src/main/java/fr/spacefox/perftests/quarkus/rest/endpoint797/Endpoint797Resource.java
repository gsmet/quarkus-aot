package fr.spacefox.perftests.quarkus.rest.endpoint797;

import fr.spacefox.perftests.quarkus.core.service797.Service797;
import fr.spacefox.perftests.quarkus.rest.endpoint797.schema.Schema797;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint797")
public class Endpoint797Resource {

    private final Service797 service;

    public Endpoint797Resource(Service797 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema797 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
