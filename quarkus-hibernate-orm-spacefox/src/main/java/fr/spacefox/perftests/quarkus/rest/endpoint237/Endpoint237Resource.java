package fr.spacefox.perftests.quarkus.rest.endpoint237;

import fr.spacefox.perftests.quarkus.core.service237.Service237;
import fr.spacefox.perftests.quarkus.rest.endpoint237.schema.Schema237;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint237")
public class Endpoint237Resource {

    private final Service237 service;

    public Endpoint237Resource(Service237 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema237 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
