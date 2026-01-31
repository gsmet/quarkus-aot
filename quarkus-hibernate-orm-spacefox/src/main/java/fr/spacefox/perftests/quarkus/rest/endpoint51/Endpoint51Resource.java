package fr.spacefox.perftests.quarkus.rest.endpoint51;

import fr.spacefox.perftests.quarkus.core.service51.Service51;
import fr.spacefox.perftests.quarkus.rest.endpoint51.schema.Schema51;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint51")
public class Endpoint51Resource {

    private final Service51 service;

    public Endpoint51Resource(Service51 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema51 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
