package fr.spacefox.perftests.quarkus.rest.endpoint328;

import fr.spacefox.perftests.quarkus.core.service328.Service328;
import fr.spacefox.perftests.quarkus.rest.endpoint328.schema.Schema328;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint328")
public class Endpoint328Resource {

    private final Service328 service;

    public Endpoint328Resource(Service328 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema328 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
