package fr.spacefox.perftests.quarkus.rest.endpoint36;

import fr.spacefox.perftests.quarkus.core.service36.Service36;
import fr.spacefox.perftests.quarkus.rest.endpoint36.schema.Schema36;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint36")
public class Endpoint36Resource {

    private final Service36 service;

    public Endpoint36Resource(Service36 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema36 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
