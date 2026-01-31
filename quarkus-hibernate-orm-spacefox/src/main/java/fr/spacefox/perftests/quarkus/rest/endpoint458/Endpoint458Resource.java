package fr.spacefox.perftests.quarkus.rest.endpoint458;

import fr.spacefox.perftests.quarkus.core.service458.Service458;
import fr.spacefox.perftests.quarkus.rest.endpoint458.schema.Schema458;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint458")
public class Endpoint458Resource {

    private final Service458 service;

    public Endpoint458Resource(Service458 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema458 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
