package fr.spacefox.perftests.quarkus.rest.endpoint144;

import fr.spacefox.perftests.quarkus.core.service144.Service144;
import fr.spacefox.perftests.quarkus.rest.endpoint144.schema.Schema144;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint144")
public class Endpoint144Resource {

    private final Service144 service;

    public Endpoint144Resource(Service144 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema144 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
