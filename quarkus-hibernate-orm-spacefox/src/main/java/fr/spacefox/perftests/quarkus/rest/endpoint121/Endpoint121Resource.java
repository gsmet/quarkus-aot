package fr.spacefox.perftests.quarkus.rest.endpoint121;

import fr.spacefox.perftests.quarkus.core.service121.Service121;
import fr.spacefox.perftests.quarkus.rest.endpoint121.schema.Schema121;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint121")
public class Endpoint121Resource {

    private final Service121 service;

    public Endpoint121Resource(Service121 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema121 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
