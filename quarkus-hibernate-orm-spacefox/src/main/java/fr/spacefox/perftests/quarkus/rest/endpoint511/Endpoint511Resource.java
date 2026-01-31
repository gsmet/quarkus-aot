package fr.spacefox.perftests.quarkus.rest.endpoint511;

import fr.spacefox.perftests.quarkus.core.service511.Service511;
import fr.spacefox.perftests.quarkus.rest.endpoint511.schema.Schema511;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint511")
public class Endpoint511Resource {

    private final Service511 service;

    public Endpoint511Resource(Service511 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema511 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
