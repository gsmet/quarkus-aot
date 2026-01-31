package fr.spacefox.perftests.quarkus.rest.endpoint651;

import fr.spacefox.perftests.quarkus.core.service651.Service651;
import fr.spacefox.perftests.quarkus.rest.endpoint651.schema.Schema651;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint651")
public class Endpoint651Resource {

    private final Service651 service;

    public Endpoint651Resource(Service651 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema651 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
