package fr.spacefox.perftests.quarkus.rest.endpoint127;

import fr.spacefox.perftests.quarkus.core.service127.Service127;
import fr.spacefox.perftests.quarkus.rest.endpoint127.schema.Schema127;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint127")
public class Endpoint127Resource {

    private final Service127 service;

    public Endpoint127Resource(Service127 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema127 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
