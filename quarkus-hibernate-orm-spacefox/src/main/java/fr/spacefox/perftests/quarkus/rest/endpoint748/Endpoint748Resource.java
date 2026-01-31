package fr.spacefox.perftests.quarkus.rest.endpoint748;

import fr.spacefox.perftests.quarkus.core.service748.Service748;
import fr.spacefox.perftests.quarkus.rest.endpoint748.schema.Schema748;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint748")
public class Endpoint748Resource {

    private final Service748 service;

    public Endpoint748Resource(Service748 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema748 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
