package fr.spacefox.perftests.quarkus.rest.endpoint633;

import fr.spacefox.perftests.quarkus.core.service633.Service633;
import fr.spacefox.perftests.quarkus.rest.endpoint633.schema.Schema633;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint633")
public class Endpoint633Resource {

    private final Service633 service;

    public Endpoint633Resource(Service633 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema633 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
