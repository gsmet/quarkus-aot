package fr.spacefox.perftests.quarkus.rest.endpoint40;

import fr.spacefox.perftests.quarkus.core.service40.Service40;
import fr.spacefox.perftests.quarkus.rest.endpoint40.schema.Schema40;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint40")
public class Endpoint40Resource {

    private final Service40 service;

    public Endpoint40Resource(Service40 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema40 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
