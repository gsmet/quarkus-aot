package fr.spacefox.perftests.quarkus.rest.endpoint780;

import fr.spacefox.perftests.quarkus.core.service780.Service780;
import fr.spacefox.perftests.quarkus.rest.endpoint780.schema.Schema780;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint780")
public class Endpoint780Resource {

    private final Service780 service;

    public Endpoint780Resource(Service780 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema780 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
