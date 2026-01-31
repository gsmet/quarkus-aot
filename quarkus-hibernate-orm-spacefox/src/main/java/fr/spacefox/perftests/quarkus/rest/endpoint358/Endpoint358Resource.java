package fr.spacefox.perftests.quarkus.rest.endpoint358;

import fr.spacefox.perftests.quarkus.core.service358.Service358;
import fr.spacefox.perftests.quarkus.rest.endpoint358.schema.Schema358;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint358")
public class Endpoint358Resource {

    private final Service358 service;

    public Endpoint358Resource(Service358 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema358 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
