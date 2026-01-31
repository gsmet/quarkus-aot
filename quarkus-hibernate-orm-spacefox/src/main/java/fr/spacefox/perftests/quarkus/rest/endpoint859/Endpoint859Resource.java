package fr.spacefox.perftests.quarkus.rest.endpoint859;

import fr.spacefox.perftests.quarkus.core.service859.Service859;
import fr.spacefox.perftests.quarkus.rest.endpoint859.schema.Schema859;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint859")
public class Endpoint859Resource {

    private final Service859 service;

    public Endpoint859Resource(Service859 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema859 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
