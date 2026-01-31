package fr.spacefox.perftests.quarkus.rest.endpoint650;

import fr.spacefox.perftests.quarkus.core.service650.Service650;
import fr.spacefox.perftests.quarkus.rest.endpoint650.schema.Schema650;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint650")
public class Endpoint650Resource {

    private final Service650 service;

    public Endpoint650Resource(Service650 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema650 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
