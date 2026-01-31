package fr.spacefox.perftests.quarkus.rest.endpoint319;

import fr.spacefox.perftests.quarkus.core.service319.Service319;
import fr.spacefox.perftests.quarkus.rest.endpoint319.schema.Schema319;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint319")
public class Endpoint319Resource {

    private final Service319 service;

    public Endpoint319Resource(Service319 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema319 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
