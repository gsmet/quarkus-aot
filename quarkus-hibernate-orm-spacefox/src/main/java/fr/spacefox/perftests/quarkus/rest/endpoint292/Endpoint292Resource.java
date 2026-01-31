package fr.spacefox.perftests.quarkus.rest.endpoint292;

import fr.spacefox.perftests.quarkus.core.service292.Service292;
import fr.spacefox.perftests.quarkus.rest.endpoint292.schema.Schema292;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint292")
public class Endpoint292Resource {

    private final Service292 service;

    public Endpoint292Resource(Service292 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema292 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
