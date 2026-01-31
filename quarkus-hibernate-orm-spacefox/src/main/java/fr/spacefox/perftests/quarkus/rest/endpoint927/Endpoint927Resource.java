package fr.spacefox.perftests.quarkus.rest.endpoint927;

import fr.spacefox.perftests.quarkus.core.service927.Service927;
import fr.spacefox.perftests.quarkus.rest.endpoint927.schema.Schema927;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint927")
public class Endpoint927Resource {

    private final Service927 service;

    public Endpoint927Resource(Service927 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema927 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
