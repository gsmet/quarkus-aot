package fr.spacefox.perftests.quarkus.rest.endpoint250;

import fr.spacefox.perftests.quarkus.core.service250.Service250;
import fr.spacefox.perftests.quarkus.rest.endpoint250.schema.Schema250;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint250")
public class Endpoint250Resource {

    private final Service250 service;

    public Endpoint250Resource(Service250 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema250 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
