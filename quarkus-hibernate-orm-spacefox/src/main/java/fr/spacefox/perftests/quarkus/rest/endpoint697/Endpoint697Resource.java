package fr.spacefox.perftests.quarkus.rest.endpoint697;

import fr.spacefox.perftests.quarkus.core.service697.Service697;
import fr.spacefox.perftests.quarkus.rest.endpoint697.schema.Schema697;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint697")
public class Endpoint697Resource {

    private final Service697 service;

    public Endpoint697Resource(Service697 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema697 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
