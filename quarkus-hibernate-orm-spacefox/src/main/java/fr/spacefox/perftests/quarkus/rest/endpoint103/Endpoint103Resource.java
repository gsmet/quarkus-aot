package fr.spacefox.perftests.quarkus.rest.endpoint103;

import fr.spacefox.perftests.quarkus.core.service103.Service103;
import fr.spacefox.perftests.quarkus.rest.endpoint103.schema.Schema103;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint103")
public class Endpoint103Resource {

    private final Service103 service;

    public Endpoint103Resource(Service103 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema103 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
