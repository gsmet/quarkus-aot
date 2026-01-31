package fr.spacefox.perftests.quarkus.rest.endpoint556;

import fr.spacefox.perftests.quarkus.core.service556.Service556;
import fr.spacefox.perftests.quarkus.rest.endpoint556.schema.Schema556;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint556")
public class Endpoint556Resource {

    private final Service556 service;

    public Endpoint556Resource(Service556 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema556 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
