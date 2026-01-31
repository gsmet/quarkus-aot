package fr.spacefox.perftests.quarkus.rest.endpoint749;

import fr.spacefox.perftests.quarkus.core.service749.Service749;
import fr.spacefox.perftests.quarkus.rest.endpoint749.schema.Schema749;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint749")
public class Endpoint749Resource {

    private final Service749 service;

    public Endpoint749Resource(Service749 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema749 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
