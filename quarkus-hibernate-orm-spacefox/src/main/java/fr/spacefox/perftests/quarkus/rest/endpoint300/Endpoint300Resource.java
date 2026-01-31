package fr.spacefox.perftests.quarkus.rest.endpoint300;

import fr.spacefox.perftests.quarkus.core.service300.Service300;
import fr.spacefox.perftests.quarkus.rest.endpoint300.schema.Schema300;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint300")
public class Endpoint300Resource {

    private final Service300 service;

    public Endpoint300Resource(Service300 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema300 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
