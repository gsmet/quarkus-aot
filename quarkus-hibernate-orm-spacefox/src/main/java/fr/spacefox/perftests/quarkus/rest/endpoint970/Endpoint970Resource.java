package fr.spacefox.perftests.quarkus.rest.endpoint970;

import fr.spacefox.perftests.quarkus.core.service970.Service970;
import fr.spacefox.perftests.quarkus.rest.endpoint970.schema.Schema970;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint970")
public class Endpoint970Resource {

    private final Service970 service;

    public Endpoint970Resource(Service970 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema970 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
