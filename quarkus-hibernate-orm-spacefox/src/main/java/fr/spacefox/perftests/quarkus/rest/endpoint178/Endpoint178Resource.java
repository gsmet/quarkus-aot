package fr.spacefox.perftests.quarkus.rest.endpoint178;

import fr.spacefox.perftests.quarkus.core.service178.Service178;
import fr.spacefox.perftests.quarkus.rest.endpoint178.schema.Schema178;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint178")
public class Endpoint178Resource {

    private final Service178 service;

    public Endpoint178Resource(Service178 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema178 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
