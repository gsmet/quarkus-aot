package fr.spacefox.perftests.quarkus.rest.endpoint994;

import fr.spacefox.perftests.quarkus.core.service994.Service994;
import fr.spacefox.perftests.quarkus.rest.endpoint994.schema.Schema994;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint994")
public class Endpoint994Resource {

    private final Service994 service;

    public Endpoint994Resource(Service994 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema994 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
