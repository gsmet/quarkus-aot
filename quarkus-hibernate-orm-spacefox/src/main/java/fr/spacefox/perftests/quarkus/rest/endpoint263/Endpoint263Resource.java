package fr.spacefox.perftests.quarkus.rest.endpoint263;

import fr.spacefox.perftests.quarkus.core.service263.Service263;
import fr.spacefox.perftests.quarkus.rest.endpoint263.schema.Schema263;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint263")
public class Endpoint263Resource {

    private final Service263 service;

    public Endpoint263Resource(Service263 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema263 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
