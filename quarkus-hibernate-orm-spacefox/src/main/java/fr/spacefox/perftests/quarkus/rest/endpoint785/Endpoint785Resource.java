package fr.spacefox.perftests.quarkus.rest.endpoint785;

import fr.spacefox.perftests.quarkus.core.service785.Service785;
import fr.spacefox.perftests.quarkus.rest.endpoint785.schema.Schema785;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint785")
public class Endpoint785Resource {

    private final Service785 service;

    public Endpoint785Resource(Service785 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema785 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
