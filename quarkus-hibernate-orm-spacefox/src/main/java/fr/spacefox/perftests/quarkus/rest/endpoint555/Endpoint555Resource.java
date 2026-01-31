package fr.spacefox.perftests.quarkus.rest.endpoint555;

import fr.spacefox.perftests.quarkus.core.service555.Service555;
import fr.spacefox.perftests.quarkus.rest.endpoint555.schema.Schema555;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint555")
public class Endpoint555Resource {

    private final Service555 service;

    public Endpoint555Resource(Service555 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema555 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
