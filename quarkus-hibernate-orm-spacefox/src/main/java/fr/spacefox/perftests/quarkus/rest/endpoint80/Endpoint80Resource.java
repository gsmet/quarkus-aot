package fr.spacefox.perftests.quarkus.rest.endpoint80;

import fr.spacefox.perftests.quarkus.core.service80.Service80;
import fr.spacefox.perftests.quarkus.rest.endpoint80.schema.Schema80;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint80")
public class Endpoint80Resource {

    private final Service80 service;

    public Endpoint80Resource(Service80 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema80 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
