package fr.spacefox.perftests.quarkus.rest.endpoint3;

import fr.spacefox.perftests.quarkus.core.service3.Service3;
import fr.spacefox.perftests.quarkus.rest.endpoint3.schema.Schema3;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint3")
public class Endpoint3Resource {

    private final Service3 service;

    public Endpoint3Resource(Service3 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema3 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
