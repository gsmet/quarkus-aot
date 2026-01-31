package fr.spacefox.perftests.quarkus.rest.endpoint755;

import fr.spacefox.perftests.quarkus.core.service755.Service755;
import fr.spacefox.perftests.quarkus.rest.endpoint755.schema.Schema755;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint755")
public class Endpoint755Resource {

    private final Service755 service;

    public Endpoint755Resource(Service755 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema755 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
