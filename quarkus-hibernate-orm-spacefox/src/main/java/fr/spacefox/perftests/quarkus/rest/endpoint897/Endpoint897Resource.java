package fr.spacefox.perftests.quarkus.rest.endpoint897;

import fr.spacefox.perftests.quarkus.core.service897.Service897;
import fr.spacefox.perftests.quarkus.rest.endpoint897.schema.Schema897;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint897")
public class Endpoint897Resource {

    private final Service897 service;

    public Endpoint897Resource(Service897 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema897 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
