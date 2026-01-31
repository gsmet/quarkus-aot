package fr.spacefox.perftests.quarkus.rest.endpoint16;

import fr.spacefox.perftests.quarkus.core.service16.Service16;
import fr.spacefox.perftests.quarkus.rest.endpoint16.schema.Schema16;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint16")
public class Endpoint16Resource {

    private final Service16 service;

    public Endpoint16Resource(Service16 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema16 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
