package fr.spacefox.perftests.quarkus.rest.endpoint978;

import fr.spacefox.perftests.quarkus.core.service978.Service978;
import fr.spacefox.perftests.quarkus.rest.endpoint978.schema.Schema978;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint978")
public class Endpoint978Resource {

    private final Service978 service;

    public Endpoint978Resource(Service978 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema978 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
