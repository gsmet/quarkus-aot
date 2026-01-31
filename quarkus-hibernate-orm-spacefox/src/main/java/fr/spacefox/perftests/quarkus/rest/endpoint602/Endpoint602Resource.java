package fr.spacefox.perftests.quarkus.rest.endpoint602;

import fr.spacefox.perftests.quarkus.core.service602.Service602;
import fr.spacefox.perftests.quarkus.rest.endpoint602.schema.Schema602;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint602")
public class Endpoint602Resource {

    private final Service602 service;

    public Endpoint602Resource(Service602 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema602 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
