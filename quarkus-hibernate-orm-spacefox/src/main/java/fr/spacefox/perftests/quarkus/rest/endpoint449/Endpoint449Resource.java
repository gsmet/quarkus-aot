package fr.spacefox.perftests.quarkus.rest.endpoint449;

import fr.spacefox.perftests.quarkus.core.service449.Service449;
import fr.spacefox.perftests.quarkus.rest.endpoint449.schema.Schema449;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint449")
public class Endpoint449Resource {

    private final Service449 service;

    public Endpoint449Resource(Service449 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema449 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
