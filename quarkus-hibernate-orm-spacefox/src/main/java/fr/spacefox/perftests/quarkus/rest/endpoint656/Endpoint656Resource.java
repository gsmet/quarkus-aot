package fr.spacefox.perftests.quarkus.rest.endpoint656;

import fr.spacefox.perftests.quarkus.core.service656.Service656;
import fr.spacefox.perftests.quarkus.rest.endpoint656.schema.Schema656;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint656")
public class Endpoint656Resource {

    private final Service656 service;

    public Endpoint656Resource(Service656 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema656 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
