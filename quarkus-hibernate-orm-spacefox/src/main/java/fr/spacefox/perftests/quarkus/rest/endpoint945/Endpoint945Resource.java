package fr.spacefox.perftests.quarkus.rest.endpoint945;

import fr.spacefox.perftests.quarkus.core.service945.Service945;
import fr.spacefox.perftests.quarkus.rest.endpoint945.schema.Schema945;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint945")
public class Endpoint945Resource {

    private final Service945 service;

    public Endpoint945Resource(Service945 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema945 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
