package fr.spacefox.perftests.quarkus.rest.endpoint646;

import fr.spacefox.perftests.quarkus.core.service646.Service646;
import fr.spacefox.perftests.quarkus.rest.endpoint646.schema.Schema646;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint646")
public class Endpoint646Resource {

    private final Service646 service;

    public Endpoint646Resource(Service646 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema646 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
