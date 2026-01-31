package fr.spacefox.perftests.quarkus.rest.endpoint439;

import fr.spacefox.perftests.quarkus.core.service439.Service439;
import fr.spacefox.perftests.quarkus.rest.endpoint439.schema.Schema439;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint439")
public class Endpoint439Resource {

    private final Service439 service;

    public Endpoint439Resource(Service439 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema439 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
