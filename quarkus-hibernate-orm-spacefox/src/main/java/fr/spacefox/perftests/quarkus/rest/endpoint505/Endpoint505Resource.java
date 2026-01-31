package fr.spacefox.perftests.quarkus.rest.endpoint505;

import fr.spacefox.perftests.quarkus.core.service505.Service505;
import fr.spacefox.perftests.quarkus.rest.endpoint505.schema.Schema505;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint505")
public class Endpoint505Resource {

    private final Service505 service;

    public Endpoint505Resource(Service505 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema505 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
