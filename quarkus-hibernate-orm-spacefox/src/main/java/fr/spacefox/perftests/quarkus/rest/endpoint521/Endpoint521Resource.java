package fr.spacefox.perftests.quarkus.rest.endpoint521;

import fr.spacefox.perftests.quarkus.core.service521.Service521;
import fr.spacefox.perftests.quarkus.rest.endpoint521.schema.Schema521;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint521")
public class Endpoint521Resource {

    private final Service521 service;

    public Endpoint521Resource(Service521 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema521 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
