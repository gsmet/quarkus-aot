package fr.spacefox.perftests.quarkus.rest.endpoint361;

import fr.spacefox.perftests.quarkus.core.service361.Service361;
import fr.spacefox.perftests.quarkus.rest.endpoint361.schema.Schema361;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint361")
public class Endpoint361Resource {

    private final Service361 service;

    public Endpoint361Resource(Service361 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema361 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
