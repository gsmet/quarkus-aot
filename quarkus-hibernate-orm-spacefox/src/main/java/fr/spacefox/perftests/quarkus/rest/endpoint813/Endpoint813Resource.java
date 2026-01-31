package fr.spacefox.perftests.quarkus.rest.endpoint813;

import fr.spacefox.perftests.quarkus.core.service813.Service813;
import fr.spacefox.perftests.quarkus.rest.endpoint813.schema.Schema813;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint813")
public class Endpoint813Resource {

    private final Service813 service;

    public Endpoint813Resource(Service813 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema813 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
