package fr.spacefox.perftests.quarkus.rest.endpoint799;

import fr.spacefox.perftests.quarkus.core.service799.Service799;
import fr.spacefox.perftests.quarkus.rest.endpoint799.schema.Schema799;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint799")
public class Endpoint799Resource {

    private final Service799 service;

    public Endpoint799Resource(Service799 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema799 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
