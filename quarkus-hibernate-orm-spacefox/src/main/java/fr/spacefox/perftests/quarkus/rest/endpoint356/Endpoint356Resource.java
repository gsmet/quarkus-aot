package fr.spacefox.perftests.quarkus.rest.endpoint356;

import fr.spacefox.perftests.quarkus.core.service356.Service356;
import fr.spacefox.perftests.quarkus.rest.endpoint356.schema.Schema356;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint356")
public class Endpoint356Resource {

    private final Service356 service;

    public Endpoint356Resource(Service356 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema356 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
