package fr.spacefox.perftests.quarkus.rest.endpoint623;

import fr.spacefox.perftests.quarkus.core.service623.Service623;
import fr.spacefox.perftests.quarkus.rest.endpoint623.schema.Schema623;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint623")
public class Endpoint623Resource {

    private final Service623 service;

    public Endpoint623Resource(Service623 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema623 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
