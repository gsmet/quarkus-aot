package fr.spacefox.perftests.quarkus.rest.endpoint256;

import fr.spacefox.perftests.quarkus.core.service256.Service256;
import fr.spacefox.perftests.quarkus.rest.endpoint256.schema.Schema256;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint256")
public class Endpoint256Resource {

    private final Service256 service;

    public Endpoint256Resource(Service256 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema256 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
