package fr.spacefox.perftests.quarkus.rest.endpoint277;

import fr.spacefox.perftests.quarkus.core.service277.Service277;
import fr.spacefox.perftests.quarkus.rest.endpoint277.schema.Schema277;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint277")
public class Endpoint277Resource {

    private final Service277 service;

    public Endpoint277Resource(Service277 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema277 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
