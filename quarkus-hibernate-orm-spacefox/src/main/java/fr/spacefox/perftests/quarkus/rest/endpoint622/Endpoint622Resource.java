package fr.spacefox.perftests.quarkus.rest.endpoint622;

import fr.spacefox.perftests.quarkus.core.service622.Service622;
import fr.spacefox.perftests.quarkus.rest.endpoint622.schema.Schema622;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint622")
public class Endpoint622Resource {

    private final Service622 service;

    public Endpoint622Resource(Service622 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema622 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
