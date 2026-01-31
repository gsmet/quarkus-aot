package fr.spacefox.perftests.quarkus.rest.endpoint769;

import fr.spacefox.perftests.quarkus.core.service769.Service769;
import fr.spacefox.perftests.quarkus.rest.endpoint769.schema.Schema769;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint769")
public class Endpoint769Resource {

    private final Service769 service;

    public Endpoint769Resource(Service769 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema769 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
