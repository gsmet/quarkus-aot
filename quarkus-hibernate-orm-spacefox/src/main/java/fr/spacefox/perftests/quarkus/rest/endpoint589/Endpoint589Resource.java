package fr.spacefox.perftests.quarkus.rest.endpoint589;

import fr.spacefox.perftests.quarkus.core.service589.Service589;
import fr.spacefox.perftests.quarkus.rest.endpoint589.schema.Schema589;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint589")
public class Endpoint589Resource {

    private final Service589 service;

    public Endpoint589Resource(Service589 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema589 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
