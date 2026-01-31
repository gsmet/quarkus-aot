package fr.spacefox.perftests.quarkus.rest.endpoint517;

import fr.spacefox.perftests.quarkus.core.service517.Service517;
import fr.spacefox.perftests.quarkus.rest.endpoint517.schema.Schema517;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint517")
public class Endpoint517Resource {

    private final Service517 service;

    public Endpoint517Resource(Service517 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema517 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
