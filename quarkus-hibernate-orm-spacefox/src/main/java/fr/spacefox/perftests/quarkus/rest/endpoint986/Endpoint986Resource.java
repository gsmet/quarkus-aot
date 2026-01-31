package fr.spacefox.perftests.quarkus.rest.endpoint986;

import fr.spacefox.perftests.quarkus.core.service986.Service986;
import fr.spacefox.perftests.quarkus.rest.endpoint986.schema.Schema986;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint986")
public class Endpoint986Resource {

    private final Service986 service;

    public Endpoint986Resource(Service986 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema986 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
