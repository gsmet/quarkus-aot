package fr.spacefox.perftests.quarkus.rest.endpoint657;

import fr.spacefox.perftests.quarkus.core.service657.Service657;
import fr.spacefox.perftests.quarkus.rest.endpoint657.schema.Schema657;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint657")
public class Endpoint657Resource {

    private final Service657 service;

    public Endpoint657Resource(Service657 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema657 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
