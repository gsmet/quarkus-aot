package fr.spacefox.perftests.quarkus.rest.endpoint776;

import fr.spacefox.perftests.quarkus.core.service776.Service776;
import fr.spacefox.perftests.quarkus.rest.endpoint776.schema.Schema776;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint776")
public class Endpoint776Resource {

    private final Service776 service;

    public Endpoint776Resource(Service776 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema776 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
