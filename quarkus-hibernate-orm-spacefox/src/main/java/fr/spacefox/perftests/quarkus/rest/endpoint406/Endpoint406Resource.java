package fr.spacefox.perftests.quarkus.rest.endpoint406;

import fr.spacefox.perftests.quarkus.core.service406.Service406;
import fr.spacefox.perftests.quarkus.rest.endpoint406.schema.Schema406;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint406")
public class Endpoint406Resource {

    private final Service406 service;

    public Endpoint406Resource(Service406 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema406 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
