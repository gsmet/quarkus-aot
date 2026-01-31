package fr.spacefox.perftests.quarkus.rest.endpoint457;

import fr.spacefox.perftests.quarkus.core.service457.Service457;
import fr.spacefox.perftests.quarkus.rest.endpoint457.schema.Schema457;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint457")
public class Endpoint457Resource {

    private final Service457 service;

    public Endpoint457Resource(Service457 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema457 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
