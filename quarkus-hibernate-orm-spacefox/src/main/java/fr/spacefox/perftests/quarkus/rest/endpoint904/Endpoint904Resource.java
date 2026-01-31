package fr.spacefox.perftests.quarkus.rest.endpoint904;

import fr.spacefox.perftests.quarkus.core.service904.Service904;
import fr.spacefox.perftests.quarkus.rest.endpoint904.schema.Schema904;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint904")
public class Endpoint904Resource {

    private final Service904 service;

    public Endpoint904Resource(Service904 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema904 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
