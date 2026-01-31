package fr.spacefox.perftests.quarkus.rest.endpoint596;

import fr.spacefox.perftests.quarkus.core.service596.Service596;
import fr.spacefox.perftests.quarkus.rest.endpoint596.schema.Schema596;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint596")
public class Endpoint596Resource {

    private final Service596 service;

    public Endpoint596Resource(Service596 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema596 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
