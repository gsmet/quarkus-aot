package fr.spacefox.perftests.quarkus.rest.endpoint996;

import fr.spacefox.perftests.quarkus.core.service996.Service996;
import fr.spacefox.perftests.quarkus.rest.endpoint996.schema.Schema996;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint996")
public class Endpoint996Resource {

    private final Service996 service;

    public Endpoint996Resource(Service996 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema996 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
