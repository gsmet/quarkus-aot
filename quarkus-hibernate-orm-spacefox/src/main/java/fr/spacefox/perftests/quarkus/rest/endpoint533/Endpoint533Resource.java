package fr.spacefox.perftests.quarkus.rest.endpoint533;

import fr.spacefox.perftests.quarkus.core.service533.Service533;
import fr.spacefox.perftests.quarkus.rest.endpoint533.schema.Schema533;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint533")
public class Endpoint533Resource {

    private final Service533 service;

    public Endpoint533Resource(Service533 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema533 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
