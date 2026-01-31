package fr.spacefox.perftests.quarkus.rest.endpoint529;

import fr.spacefox.perftests.quarkus.core.service529.Service529;
import fr.spacefox.perftests.quarkus.rest.endpoint529.schema.Schema529;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint529")
public class Endpoint529Resource {

    private final Service529 service;

    public Endpoint529Resource(Service529 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema529 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
