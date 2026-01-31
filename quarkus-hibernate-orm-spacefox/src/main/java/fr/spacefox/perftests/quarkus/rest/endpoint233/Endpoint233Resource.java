package fr.spacefox.perftests.quarkus.rest.endpoint233;

import fr.spacefox.perftests.quarkus.core.service233.Service233;
import fr.spacefox.perftests.quarkus.rest.endpoint233.schema.Schema233;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint233")
public class Endpoint233Resource {

    private final Service233 service;

    public Endpoint233Resource(Service233 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema233 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
