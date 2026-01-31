package fr.spacefox.perftests.quarkus.rest.endpoint446;

import fr.spacefox.perftests.quarkus.core.service446.Service446;
import fr.spacefox.perftests.quarkus.rest.endpoint446.schema.Schema446;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint446")
public class Endpoint446Resource {

    private final Service446 service;

    public Endpoint446Resource(Service446 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema446 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
