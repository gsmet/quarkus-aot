package fr.spacefox.perftests.quarkus.rest.endpoint123;

import fr.spacefox.perftests.quarkus.core.service123.Service123;
import fr.spacefox.perftests.quarkus.rest.endpoint123.schema.Schema123;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint123")
public class Endpoint123Resource {

    private final Service123 service;

    public Endpoint123Resource(Service123 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema123 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
