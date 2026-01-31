package fr.spacefox.perftests.quarkus.rest.endpoint882;

import fr.spacefox.perftests.quarkus.core.service882.Service882;
import fr.spacefox.perftests.quarkus.rest.endpoint882.schema.Schema882;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint882")
public class Endpoint882Resource {

    private final Service882 service;

    public Endpoint882Resource(Service882 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema882 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
