package fr.spacefox.perftests.quarkus.rest.endpoint524;

import fr.spacefox.perftests.quarkus.core.service524.Service524;
import fr.spacefox.perftests.quarkus.rest.endpoint524.schema.Schema524;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint524")
public class Endpoint524Resource {

    private final Service524 service;

    public Endpoint524Resource(Service524 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema524 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
