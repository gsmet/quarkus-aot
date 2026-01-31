package fr.spacefox.perftests.quarkus.rest.endpoint883;

import fr.spacefox.perftests.quarkus.core.service883.Service883;
import fr.spacefox.perftests.quarkus.rest.endpoint883.schema.Schema883;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint883")
public class Endpoint883Resource {

    private final Service883 service;

    public Endpoint883Resource(Service883 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema883 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
