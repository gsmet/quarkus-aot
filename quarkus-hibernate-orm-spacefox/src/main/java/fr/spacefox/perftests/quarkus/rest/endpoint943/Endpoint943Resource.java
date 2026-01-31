package fr.spacefox.perftests.quarkus.rest.endpoint943;

import fr.spacefox.perftests.quarkus.core.service943.Service943;
import fr.spacefox.perftests.quarkus.rest.endpoint943.schema.Schema943;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint943")
public class Endpoint943Resource {

    private final Service943 service;

    public Endpoint943Resource(Service943 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema943 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
