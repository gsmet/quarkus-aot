package fr.spacefox.perftests.quarkus.rest.endpoint396;

import fr.spacefox.perftests.quarkus.core.service396.Service396;
import fr.spacefox.perftests.quarkus.rest.endpoint396.schema.Schema396;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint396")
public class Endpoint396Resource {

    private final Service396 service;

    public Endpoint396Resource(Service396 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema396 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
