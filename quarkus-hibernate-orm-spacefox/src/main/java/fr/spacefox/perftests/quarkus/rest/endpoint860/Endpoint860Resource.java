package fr.spacefox.perftests.quarkus.rest.endpoint860;

import fr.spacefox.perftests.quarkus.core.service860.Service860;
import fr.spacefox.perftests.quarkus.rest.endpoint860.schema.Schema860;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint860")
public class Endpoint860Resource {

    private final Service860 service;

    public Endpoint860Resource(Service860 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema860 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
