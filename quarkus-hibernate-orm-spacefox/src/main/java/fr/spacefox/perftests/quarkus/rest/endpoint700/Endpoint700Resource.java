package fr.spacefox.perftests.quarkus.rest.endpoint700;

import fr.spacefox.perftests.quarkus.core.service700.Service700;
import fr.spacefox.perftests.quarkus.rest.endpoint700.schema.Schema700;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint700")
public class Endpoint700Resource {

    private final Service700 service;

    public Endpoint700Resource(Service700 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema700 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
