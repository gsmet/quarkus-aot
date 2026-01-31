package fr.spacefox.perftests.quarkus.rest.endpoint767;

import fr.spacefox.perftests.quarkus.core.service767.Service767;
import fr.spacefox.perftests.quarkus.rest.endpoint767.schema.Schema767;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint767")
public class Endpoint767Resource {

    private final Service767 service;

    public Endpoint767Resource(Service767 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema767 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
