package fr.spacefox.perftests.quarkus.rest.endpoint273;

import fr.spacefox.perftests.quarkus.core.service273.Service273;
import fr.spacefox.perftests.quarkus.rest.endpoint273.schema.Schema273;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint273")
public class Endpoint273Resource {

    private final Service273 service;

    public Endpoint273Resource(Service273 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema273 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
