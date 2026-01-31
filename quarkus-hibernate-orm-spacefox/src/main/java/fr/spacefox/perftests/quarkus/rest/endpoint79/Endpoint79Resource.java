package fr.spacefox.perftests.quarkus.rest.endpoint79;

import fr.spacefox.perftests.quarkus.core.service79.Service79;
import fr.spacefox.perftests.quarkus.rest.endpoint79.schema.Schema79;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint79")
public class Endpoint79Resource {

    private final Service79 service;

    public Endpoint79Resource(Service79 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema79 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
