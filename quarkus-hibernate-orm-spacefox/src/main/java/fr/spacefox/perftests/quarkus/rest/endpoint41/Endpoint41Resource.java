package fr.spacefox.perftests.quarkus.rest.endpoint41;

import fr.spacefox.perftests.quarkus.core.service41.Service41;
import fr.spacefox.perftests.quarkus.rest.endpoint41.schema.Schema41;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint41")
public class Endpoint41Resource {

    private final Service41 service;

    public Endpoint41Resource(Service41 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema41 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
