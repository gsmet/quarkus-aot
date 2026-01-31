package fr.spacefox.perftests.quarkus.rest.endpoint940;

import fr.spacefox.perftests.quarkus.core.service940.Service940;
import fr.spacefox.perftests.quarkus.rest.endpoint940.schema.Schema940;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint940")
public class Endpoint940Resource {

    private final Service940 service;

    public Endpoint940Resource(Service940 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema940 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
