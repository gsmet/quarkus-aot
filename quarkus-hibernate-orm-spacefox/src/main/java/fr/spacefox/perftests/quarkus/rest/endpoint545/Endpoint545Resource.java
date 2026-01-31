package fr.spacefox.perftests.quarkus.rest.endpoint545;

import fr.spacefox.perftests.quarkus.core.service545.Service545;
import fr.spacefox.perftests.quarkus.rest.endpoint545.schema.Schema545;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint545")
public class Endpoint545Resource {

    private final Service545 service;

    public Endpoint545Resource(Service545 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema545 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
