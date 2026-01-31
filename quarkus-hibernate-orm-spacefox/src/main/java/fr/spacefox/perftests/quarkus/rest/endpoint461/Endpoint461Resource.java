package fr.spacefox.perftests.quarkus.rest.endpoint461;

import fr.spacefox.perftests.quarkus.core.service461.Service461;
import fr.spacefox.perftests.quarkus.rest.endpoint461.schema.Schema461;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint461")
public class Endpoint461Resource {

    private final Service461 service;

    public Endpoint461Resource(Service461 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema461 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
