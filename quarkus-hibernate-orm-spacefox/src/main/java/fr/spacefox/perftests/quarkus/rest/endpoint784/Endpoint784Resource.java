package fr.spacefox.perftests.quarkus.rest.endpoint784;

import fr.spacefox.perftests.quarkus.core.service784.Service784;
import fr.spacefox.perftests.quarkus.rest.endpoint784.schema.Schema784;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint784")
public class Endpoint784Resource {

    private final Service784 service;

    public Endpoint784Resource(Service784 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema784 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
