package fr.spacefox.perftests.quarkus.rest.endpoint928;

import fr.spacefox.perftests.quarkus.core.service928.Service928;
import fr.spacefox.perftests.quarkus.rest.endpoint928.schema.Schema928;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint928")
public class Endpoint928Resource {

    private final Service928 service;

    public Endpoint928Resource(Service928 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema928 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
