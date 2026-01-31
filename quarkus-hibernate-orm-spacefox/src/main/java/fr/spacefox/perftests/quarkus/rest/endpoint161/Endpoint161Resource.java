package fr.spacefox.perftests.quarkus.rest.endpoint161;

import fr.spacefox.perftests.quarkus.core.service161.Service161;
import fr.spacefox.perftests.quarkus.rest.endpoint161.schema.Schema161;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint161")
public class Endpoint161Resource {

    private final Service161 service;

    public Endpoint161Resource(Service161 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema161 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
