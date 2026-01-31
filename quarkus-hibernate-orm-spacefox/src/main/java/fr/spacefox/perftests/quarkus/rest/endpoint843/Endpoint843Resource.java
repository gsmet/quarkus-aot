package fr.spacefox.perftests.quarkus.rest.endpoint843;

import fr.spacefox.perftests.quarkus.core.service843.Service843;
import fr.spacefox.perftests.quarkus.rest.endpoint843.schema.Schema843;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint843")
public class Endpoint843Resource {

    private final Service843 service;

    public Endpoint843Resource(Service843 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema843 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
