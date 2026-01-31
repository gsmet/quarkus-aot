package fr.spacefox.perftests.quarkus.rest.endpoint216;

import fr.spacefox.perftests.quarkus.core.service216.Service216;
import fr.spacefox.perftests.quarkus.rest.endpoint216.schema.Schema216;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint216")
public class Endpoint216Resource {

    private final Service216 service;

    public Endpoint216Resource(Service216 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema216 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
