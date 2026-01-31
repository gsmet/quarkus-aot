package fr.spacefox.perftests.quarkus.rest.endpoint732;

import fr.spacefox.perftests.quarkus.core.service732.Service732;
import fr.spacefox.perftests.quarkus.rest.endpoint732.schema.Schema732;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint732")
public class Endpoint732Resource {

    private final Service732 service;

    public Endpoint732Resource(Service732 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema732 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
