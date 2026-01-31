package fr.spacefox.perftests.quarkus.rest.endpoint652;

import fr.spacefox.perftests.quarkus.core.service652.Service652;
import fr.spacefox.perftests.quarkus.rest.endpoint652.schema.Schema652;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint652")
public class Endpoint652Resource {

    private final Service652 service;

    public Endpoint652Resource(Service652 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema652 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
