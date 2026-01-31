package fr.spacefox.perftests.quarkus.rest.endpoint393;

import fr.spacefox.perftests.quarkus.core.service393.Service393;
import fr.spacefox.perftests.quarkus.rest.endpoint393.schema.Schema393;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint393")
public class Endpoint393Resource {

    private final Service393 service;

    public Endpoint393Resource(Service393 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema393 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
