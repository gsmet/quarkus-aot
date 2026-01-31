package fr.spacefox.perftests.quarkus.rest.endpoint404;

import fr.spacefox.perftests.quarkus.core.service404.Service404;
import fr.spacefox.perftests.quarkus.rest.endpoint404.schema.Schema404;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint404")
public class Endpoint404Resource {

    private final Service404 service;

    public Endpoint404Resource(Service404 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema404 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
