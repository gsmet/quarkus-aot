package fr.spacefox.perftests.quarkus.rest.endpoint810;

import fr.spacefox.perftests.quarkus.core.service810.Service810;
import fr.spacefox.perftests.quarkus.rest.endpoint810.schema.Schema810;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint810")
public class Endpoint810Resource {

    private final Service810 service;

    public Endpoint810Resource(Service810 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema810 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
