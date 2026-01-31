package fr.spacefox.perftests.quarkus.rest.endpoint288;

import fr.spacefox.perftests.quarkus.core.service288.Service288;
import fr.spacefox.perftests.quarkus.rest.endpoint288.schema.Schema288;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint288")
public class Endpoint288Resource {

    private final Service288 service;

    public Endpoint288Resource(Service288 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema288 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
