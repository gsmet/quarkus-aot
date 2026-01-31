package fr.spacefox.perftests.quarkus.rest.endpoint603;

import fr.spacefox.perftests.quarkus.core.service603.Service603;
import fr.spacefox.perftests.quarkus.rest.endpoint603.schema.Schema603;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint603")
public class Endpoint603Resource {

    private final Service603 service;

    public Endpoint603Resource(Service603 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema603 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
