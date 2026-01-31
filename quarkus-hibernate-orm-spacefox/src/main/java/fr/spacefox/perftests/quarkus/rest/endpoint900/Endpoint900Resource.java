package fr.spacefox.perftests.quarkus.rest.endpoint900;

import fr.spacefox.perftests.quarkus.core.service900.Service900;
import fr.spacefox.perftests.quarkus.rest.endpoint900.schema.Schema900;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint900")
public class Endpoint900Resource {

    private final Service900 service;

    public Endpoint900Resource(Service900 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema900 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
