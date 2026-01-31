package fr.spacefox.perftests.quarkus.rest.endpoint681;

import fr.spacefox.perftests.quarkus.core.service681.Service681;
import fr.spacefox.perftests.quarkus.rest.endpoint681.schema.Schema681;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint681")
public class Endpoint681Resource {

    private final Service681 service;

    public Endpoint681Resource(Service681 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema681 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
