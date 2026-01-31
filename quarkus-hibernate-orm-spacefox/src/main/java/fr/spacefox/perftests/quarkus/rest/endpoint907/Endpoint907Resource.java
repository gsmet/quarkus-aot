package fr.spacefox.perftests.quarkus.rest.endpoint907;

import fr.spacefox.perftests.quarkus.core.service907.Service907;
import fr.spacefox.perftests.quarkus.rest.endpoint907.schema.Schema907;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint907")
public class Endpoint907Resource {

    private final Service907 service;

    public Endpoint907Resource(Service907 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema907 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
