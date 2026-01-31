package fr.spacefox.perftests.quarkus.rest.endpoint854;

import fr.spacefox.perftests.quarkus.core.service854.Service854;
import fr.spacefox.perftests.quarkus.rest.endpoint854.schema.Schema854;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint854")
public class Endpoint854Resource {

    private final Service854 service;

    public Endpoint854Resource(Service854 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema854 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
