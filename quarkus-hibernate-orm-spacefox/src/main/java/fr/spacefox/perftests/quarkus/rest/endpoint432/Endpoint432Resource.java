package fr.spacefox.perftests.quarkus.rest.endpoint432;

import fr.spacefox.perftests.quarkus.core.service432.Service432;
import fr.spacefox.perftests.quarkus.rest.endpoint432.schema.Schema432;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint432")
public class Endpoint432Resource {

    private final Service432 service;

    public Endpoint432Resource(Service432 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema432 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
