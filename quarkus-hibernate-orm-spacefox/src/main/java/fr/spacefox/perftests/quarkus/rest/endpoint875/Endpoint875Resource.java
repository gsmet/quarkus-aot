package fr.spacefox.perftests.quarkus.rest.endpoint875;

import fr.spacefox.perftests.quarkus.core.service875.Service875;
import fr.spacefox.perftests.quarkus.rest.endpoint875.schema.Schema875;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint875")
public class Endpoint875Resource {

    private final Service875 service;

    public Endpoint875Resource(Service875 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema875 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
