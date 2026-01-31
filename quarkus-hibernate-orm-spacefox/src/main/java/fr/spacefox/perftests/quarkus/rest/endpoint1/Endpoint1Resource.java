package fr.spacefox.perftests.quarkus.rest.endpoint1;

import fr.spacefox.perftests.quarkus.core.service1.Service1;
import fr.spacefox.perftests.quarkus.rest.endpoint1.schema.Schema1;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint1")
public class Endpoint1Resource {

    private final Service1 service;

    public Endpoint1Resource(Service1 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema1 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
