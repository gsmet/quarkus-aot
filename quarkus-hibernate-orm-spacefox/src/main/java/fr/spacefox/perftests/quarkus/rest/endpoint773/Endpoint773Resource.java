package fr.spacefox.perftests.quarkus.rest.endpoint773;

import fr.spacefox.perftests.quarkus.core.service773.Service773;
import fr.spacefox.perftests.quarkus.rest.endpoint773.schema.Schema773;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint773")
public class Endpoint773Resource {

    private final Service773 service;

    public Endpoint773Resource(Service773 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema773 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
