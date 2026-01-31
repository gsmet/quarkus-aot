package fr.spacefox.perftests.quarkus.rest.endpoint253;

import fr.spacefox.perftests.quarkus.core.service253.Service253;
import fr.spacefox.perftests.quarkus.rest.endpoint253.schema.Schema253;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint253")
public class Endpoint253Resource {

    private final Service253 service;

    public Endpoint253Resource(Service253 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema253 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
