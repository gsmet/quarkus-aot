package fr.spacefox.perftests.quarkus.rest.endpoint124;

import fr.spacefox.perftests.quarkus.core.service124.Service124;
import fr.spacefox.perftests.quarkus.rest.endpoint124.schema.Schema124;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint124")
public class Endpoint124Resource {

    private final Service124 service;

    public Endpoint124Resource(Service124 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema124 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
