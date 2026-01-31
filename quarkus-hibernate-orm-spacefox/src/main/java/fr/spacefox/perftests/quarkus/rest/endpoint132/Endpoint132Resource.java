package fr.spacefox.perftests.quarkus.rest.endpoint132;

import fr.spacefox.perftests.quarkus.core.service132.Service132;
import fr.spacefox.perftests.quarkus.rest.endpoint132.schema.Schema132;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint132")
public class Endpoint132Resource {

    private final Service132 service;

    public Endpoint132Resource(Service132 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema132 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
