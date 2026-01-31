package fr.spacefox.perftests.quarkus.rest.endpoint428;

import fr.spacefox.perftests.quarkus.core.service428.Service428;
import fr.spacefox.perftests.quarkus.rest.endpoint428.schema.Schema428;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint428")
public class Endpoint428Resource {

    private final Service428 service;

    public Endpoint428Resource(Service428 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema428 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
