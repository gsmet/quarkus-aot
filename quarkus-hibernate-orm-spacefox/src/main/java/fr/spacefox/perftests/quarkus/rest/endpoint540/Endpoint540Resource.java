package fr.spacefox.perftests.quarkus.rest.endpoint540;

import fr.spacefox.perftests.quarkus.core.service540.Service540;
import fr.spacefox.perftests.quarkus.rest.endpoint540.schema.Schema540;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint540")
public class Endpoint540Resource {

    private final Service540 service;

    public Endpoint540Resource(Service540 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema540 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
