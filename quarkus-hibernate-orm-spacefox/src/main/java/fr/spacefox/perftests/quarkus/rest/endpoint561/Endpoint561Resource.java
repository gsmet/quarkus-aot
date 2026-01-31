package fr.spacefox.perftests.quarkus.rest.endpoint561;

import fr.spacefox.perftests.quarkus.core.service561.Service561;
import fr.spacefox.perftests.quarkus.rest.endpoint561.schema.Schema561;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint561")
public class Endpoint561Resource {

    private final Service561 service;

    public Endpoint561Resource(Service561 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema561 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
