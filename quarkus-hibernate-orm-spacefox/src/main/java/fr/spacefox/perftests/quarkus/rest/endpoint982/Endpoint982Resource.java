package fr.spacefox.perftests.quarkus.rest.endpoint982;

import fr.spacefox.perftests.quarkus.core.service982.Service982;
import fr.spacefox.perftests.quarkus.rest.endpoint982.schema.Schema982;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint982")
public class Endpoint982Resource {

    private final Service982 service;

    public Endpoint982Resource(Service982 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema982 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
