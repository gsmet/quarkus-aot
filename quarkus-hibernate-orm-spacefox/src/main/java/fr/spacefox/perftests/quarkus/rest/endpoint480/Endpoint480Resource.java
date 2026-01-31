package fr.spacefox.perftests.quarkus.rest.endpoint480;

import fr.spacefox.perftests.quarkus.core.service480.Service480;
import fr.spacefox.perftests.quarkus.rest.endpoint480.schema.Schema480;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint480")
public class Endpoint480Resource {

    private final Service480 service;

    public Endpoint480Resource(Service480 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema480 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
