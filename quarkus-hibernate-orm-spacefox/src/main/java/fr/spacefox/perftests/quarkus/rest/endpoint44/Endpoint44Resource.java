package fr.spacefox.perftests.quarkus.rest.endpoint44;

import fr.spacefox.perftests.quarkus.core.service44.Service44;
import fr.spacefox.perftests.quarkus.rest.endpoint44.schema.Schema44;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint44")
public class Endpoint44Resource {

    private final Service44 service;

    public Endpoint44Resource(Service44 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema44 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
