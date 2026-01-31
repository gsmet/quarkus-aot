package fr.spacefox.perftests.quarkus.rest.endpoint2;

import fr.spacefox.perftests.quarkus.core.service2.Service2;
import fr.spacefox.perftests.quarkus.rest.endpoint2.schema.Schema2;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint2")
public class Endpoint2Resource {

    private final Service2 service;

    public Endpoint2Resource(Service2 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema2 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
