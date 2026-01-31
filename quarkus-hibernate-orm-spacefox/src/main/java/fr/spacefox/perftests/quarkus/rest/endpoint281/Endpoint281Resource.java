package fr.spacefox.perftests.quarkus.rest.endpoint281;

import fr.spacefox.perftests.quarkus.core.service281.Service281;
import fr.spacefox.perftests.quarkus.rest.endpoint281.schema.Schema281;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint281")
public class Endpoint281Resource {

    private final Service281 service;

    public Endpoint281Resource(Service281 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema281 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
