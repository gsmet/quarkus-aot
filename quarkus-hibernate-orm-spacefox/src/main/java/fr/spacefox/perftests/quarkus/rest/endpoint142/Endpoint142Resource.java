package fr.spacefox.perftests.quarkus.rest.endpoint142;

import fr.spacefox.perftests.quarkus.core.service142.Service142;
import fr.spacefox.perftests.quarkus.rest.endpoint142.schema.Schema142;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint142")
public class Endpoint142Resource {

    private final Service142 service;

    public Endpoint142Resource(Service142 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema142 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
