package fr.spacefox.perftests.quarkus.rest.endpoint845;

import fr.spacefox.perftests.quarkus.core.service845.Service845;
import fr.spacefox.perftests.quarkus.rest.endpoint845.schema.Schema845;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint845")
public class Endpoint845Resource {

    private final Service845 service;

    public Endpoint845Resource(Service845 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema845 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
