package fr.spacefox.perftests.quarkus.rest.endpoint171;

import fr.spacefox.perftests.quarkus.core.service171.Service171;
import fr.spacefox.perftests.quarkus.rest.endpoint171.schema.Schema171;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint171")
public class Endpoint171Resource {

    private final Service171 service;

    public Endpoint171Resource(Service171 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema171 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
