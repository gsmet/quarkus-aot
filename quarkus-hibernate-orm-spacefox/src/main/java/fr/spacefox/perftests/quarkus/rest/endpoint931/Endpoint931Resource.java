package fr.spacefox.perftests.quarkus.rest.endpoint931;

import fr.spacefox.perftests.quarkus.core.service931.Service931;
import fr.spacefox.perftests.quarkus.rest.endpoint931.schema.Schema931;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint931")
public class Endpoint931Resource {

    private final Service931 service;

    public Endpoint931Resource(Service931 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema931 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
