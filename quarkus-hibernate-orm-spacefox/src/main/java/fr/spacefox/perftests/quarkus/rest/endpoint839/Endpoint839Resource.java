package fr.spacefox.perftests.quarkus.rest.endpoint839;

import fr.spacefox.perftests.quarkus.core.service839.Service839;
import fr.spacefox.perftests.quarkus.rest.endpoint839.schema.Schema839;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint839")
public class Endpoint839Resource {

    private final Service839 service;

    public Endpoint839Resource(Service839 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema839 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
