package fr.spacefox.perftests.quarkus.rest.endpoint224;

import fr.spacefox.perftests.quarkus.core.service224.Service224;
import fr.spacefox.perftests.quarkus.rest.endpoint224.schema.Schema224;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint224")
public class Endpoint224Resource {

    private final Service224 service;

    public Endpoint224Resource(Service224 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema224 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
