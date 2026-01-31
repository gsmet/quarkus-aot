package fr.spacefox.perftests.quarkus.rest.endpoint888;

import fr.spacefox.perftests.quarkus.core.service888.Service888;
import fr.spacefox.perftests.quarkus.rest.endpoint888.schema.Schema888;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint888")
public class Endpoint888Resource {

    private final Service888 service;

    public Endpoint888Resource(Service888 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema888 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
