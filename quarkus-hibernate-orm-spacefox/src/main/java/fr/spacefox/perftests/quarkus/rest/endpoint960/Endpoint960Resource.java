package fr.spacefox.perftests.quarkus.rest.endpoint960;

import fr.spacefox.perftests.quarkus.core.service960.Service960;
import fr.spacefox.perftests.quarkus.rest.endpoint960.schema.Schema960;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint960")
public class Endpoint960Resource {

    private final Service960 service;

    public Endpoint960Resource(Service960 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema960 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
