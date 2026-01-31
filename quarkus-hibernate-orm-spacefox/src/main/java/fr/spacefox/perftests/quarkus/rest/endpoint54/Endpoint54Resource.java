package fr.spacefox.perftests.quarkus.rest.endpoint54;

import fr.spacefox.perftests.quarkus.core.service54.Service54;
import fr.spacefox.perftests.quarkus.rest.endpoint54.schema.Schema54;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint54")
public class Endpoint54Resource {

    private final Service54 service;

    public Endpoint54Resource(Service54 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema54 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
