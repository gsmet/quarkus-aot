package fr.spacefox.perftests.quarkus.rest.endpoint584;

import fr.spacefox.perftests.quarkus.core.service584.Service584;
import fr.spacefox.perftests.quarkus.rest.endpoint584.schema.Schema584;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint584")
public class Endpoint584Resource {

    private final Service584 service;

    public Endpoint584Resource(Service584 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema584 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
