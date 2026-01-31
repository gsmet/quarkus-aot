package fr.spacefox.perftests.quarkus.rest.endpoint548;

import fr.spacefox.perftests.quarkus.core.service548.Service548;
import fr.spacefox.perftests.quarkus.rest.endpoint548.schema.Schema548;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint548")
public class Endpoint548Resource {

    private final Service548 service;

    public Endpoint548Resource(Service548 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema548 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
