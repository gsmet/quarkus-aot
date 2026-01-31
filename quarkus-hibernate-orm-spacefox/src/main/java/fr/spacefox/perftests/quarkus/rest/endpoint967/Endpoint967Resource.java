package fr.spacefox.perftests.quarkus.rest.endpoint967;

import fr.spacefox.perftests.quarkus.core.service967.Service967;
import fr.spacefox.perftests.quarkus.rest.endpoint967.schema.Schema967;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint967")
public class Endpoint967Resource {

    private final Service967 service;

    public Endpoint967Resource(Service967 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema967 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
