package fr.spacefox.perftests.quarkus.rest.endpoint547;

import fr.spacefox.perftests.quarkus.core.service547.Service547;
import fr.spacefox.perftests.quarkus.rest.endpoint547.schema.Schema547;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint547")
public class Endpoint547Resource {

    private final Service547 service;

    public Endpoint547Resource(Service547 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema547 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
