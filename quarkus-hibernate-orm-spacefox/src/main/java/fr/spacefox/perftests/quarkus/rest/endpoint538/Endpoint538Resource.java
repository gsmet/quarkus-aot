package fr.spacefox.perftests.quarkus.rest.endpoint538;

import fr.spacefox.perftests.quarkus.core.service538.Service538;
import fr.spacefox.perftests.quarkus.rest.endpoint538.schema.Schema538;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint538")
public class Endpoint538Resource {

    private final Service538 service;

    public Endpoint538Resource(Service538 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema538 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
