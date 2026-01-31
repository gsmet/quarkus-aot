package fr.spacefox.perftests.quarkus.rest.endpoint464;

import fr.spacefox.perftests.quarkus.core.service464.Service464;
import fr.spacefox.perftests.quarkus.rest.endpoint464.schema.Schema464;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint464")
public class Endpoint464Resource {

    private final Service464 service;

    public Endpoint464Resource(Service464 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema464 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
