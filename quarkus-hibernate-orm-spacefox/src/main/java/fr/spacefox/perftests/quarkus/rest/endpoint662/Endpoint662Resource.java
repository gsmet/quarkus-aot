package fr.spacefox.perftests.quarkus.rest.endpoint662;

import fr.spacefox.perftests.quarkus.core.service662.Service662;
import fr.spacefox.perftests.quarkus.rest.endpoint662.schema.Schema662;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint662")
public class Endpoint662Resource {

    private final Service662 service;

    public Endpoint662Resource(Service662 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema662 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
