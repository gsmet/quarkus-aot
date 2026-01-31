package fr.spacefox.perftests.quarkus.rest.endpoint902;

import fr.spacefox.perftests.quarkus.core.service902.Service902;
import fr.spacefox.perftests.quarkus.rest.endpoint902.schema.Schema902;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint902")
public class Endpoint902Resource {

    private final Service902 service;

    public Endpoint902Resource(Service902 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema902 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
