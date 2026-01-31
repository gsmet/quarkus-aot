package fr.spacefox.perftests.quarkus.rest.endpoint605;

import fr.spacefox.perftests.quarkus.core.service605.Service605;
import fr.spacefox.perftests.quarkus.rest.endpoint605.schema.Schema605;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint605")
public class Endpoint605Resource {

    private final Service605 service;

    public Endpoint605Resource(Service605 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema605 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
