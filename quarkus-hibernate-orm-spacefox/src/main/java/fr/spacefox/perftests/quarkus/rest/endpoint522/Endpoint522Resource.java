package fr.spacefox.perftests.quarkus.rest.endpoint522;

import fr.spacefox.perftests.quarkus.core.service522.Service522;
import fr.spacefox.perftests.quarkus.rest.endpoint522.schema.Schema522;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint522")
public class Endpoint522Resource {

    private final Service522 service;

    public Endpoint522Resource(Service522 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema522 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
