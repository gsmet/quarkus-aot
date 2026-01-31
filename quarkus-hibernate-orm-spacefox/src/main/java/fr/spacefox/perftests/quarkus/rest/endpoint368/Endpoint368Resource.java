package fr.spacefox.perftests.quarkus.rest.endpoint368;

import fr.spacefox.perftests.quarkus.core.service368.Service368;
import fr.spacefox.perftests.quarkus.rest.endpoint368.schema.Schema368;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint368")
public class Endpoint368Resource {

    private final Service368 service;

    public Endpoint368Resource(Service368 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema368 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
