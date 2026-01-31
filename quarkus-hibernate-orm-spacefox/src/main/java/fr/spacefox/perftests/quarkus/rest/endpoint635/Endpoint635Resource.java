package fr.spacefox.perftests.quarkus.rest.endpoint635;

import fr.spacefox.perftests.quarkus.core.service635.Service635;
import fr.spacefox.perftests.quarkus.rest.endpoint635.schema.Schema635;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint635")
public class Endpoint635Resource {

    private final Service635 service;

    public Endpoint635Resource(Service635 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema635 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
