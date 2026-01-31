package fr.spacefox.perftests.quarkus.rest.endpoint594;

import fr.spacefox.perftests.quarkus.core.service594.Service594;
import fr.spacefox.perftests.quarkus.rest.endpoint594.schema.Schema594;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint594")
public class Endpoint594Resource {

    private final Service594 service;

    public Endpoint594Resource(Service594 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema594 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
