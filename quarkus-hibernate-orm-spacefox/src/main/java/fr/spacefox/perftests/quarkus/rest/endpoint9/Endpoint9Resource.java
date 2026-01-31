package fr.spacefox.perftests.quarkus.rest.endpoint9;

import fr.spacefox.perftests.quarkus.core.service9.Service9;
import fr.spacefox.perftests.quarkus.rest.endpoint9.schema.Schema9;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint9")
public class Endpoint9Resource {

    private final Service9 service;

    public Endpoint9Resource(Service9 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema9 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
