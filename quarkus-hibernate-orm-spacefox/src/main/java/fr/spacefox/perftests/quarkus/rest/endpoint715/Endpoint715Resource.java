package fr.spacefox.perftests.quarkus.rest.endpoint715;

import fr.spacefox.perftests.quarkus.core.service715.Service715;
import fr.spacefox.perftests.quarkus.rest.endpoint715.schema.Schema715;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint715")
public class Endpoint715Resource {

    private final Service715 service;

    public Endpoint715Resource(Service715 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema715 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
