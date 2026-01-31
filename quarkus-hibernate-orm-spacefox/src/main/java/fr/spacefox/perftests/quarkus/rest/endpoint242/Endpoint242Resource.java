package fr.spacefox.perftests.quarkus.rest.endpoint242;

import fr.spacefox.perftests.quarkus.core.service242.Service242;
import fr.spacefox.perftests.quarkus.rest.endpoint242.schema.Schema242;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint242")
public class Endpoint242Resource {

    private final Service242 service;

    public Endpoint242Resource(Service242 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema242 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
