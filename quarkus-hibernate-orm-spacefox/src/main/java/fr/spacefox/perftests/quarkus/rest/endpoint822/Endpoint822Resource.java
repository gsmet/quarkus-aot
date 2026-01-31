package fr.spacefox.perftests.quarkus.rest.endpoint822;

import fr.spacefox.perftests.quarkus.core.service822.Service822;
import fr.spacefox.perftests.quarkus.rest.endpoint822.schema.Schema822;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint822")
public class Endpoint822Resource {

    private final Service822 service;

    public Endpoint822Resource(Service822 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema822 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
