package fr.spacefox.perftests.quarkus.rest.endpoint65;

import fr.spacefox.perftests.quarkus.core.service65.Service65;
import fr.spacefox.perftests.quarkus.rest.endpoint65.schema.Schema65;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint65")
public class Endpoint65Resource {

    private final Service65 service;

    public Endpoint65Resource(Service65 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema65 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
