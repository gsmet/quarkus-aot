package fr.spacefox.perftests.quarkus.rest.endpoint817;

import fr.spacefox.perftests.quarkus.core.service817.Service817;
import fr.spacefox.perftests.quarkus.rest.endpoint817.schema.Schema817;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint817")
public class Endpoint817Resource {

    private final Service817 service;

    public Endpoint817Resource(Service817 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema817 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
