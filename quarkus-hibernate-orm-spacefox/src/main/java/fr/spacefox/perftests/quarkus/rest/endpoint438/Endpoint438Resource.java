package fr.spacefox.perftests.quarkus.rest.endpoint438;

import fr.spacefox.perftests.quarkus.core.service438.Service438;
import fr.spacefox.perftests.quarkus.rest.endpoint438.schema.Schema438;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint438")
public class Endpoint438Resource {

    private final Service438 service;

    public Endpoint438Resource(Service438 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema438 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
