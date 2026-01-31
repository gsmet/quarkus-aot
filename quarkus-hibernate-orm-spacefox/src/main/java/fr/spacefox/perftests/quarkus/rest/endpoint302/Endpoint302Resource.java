package fr.spacefox.perftests.quarkus.rest.endpoint302;

import fr.spacefox.perftests.quarkus.core.service302.Service302;
import fr.spacefox.perftests.quarkus.rest.endpoint302.schema.Schema302;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint302")
public class Endpoint302Resource {

    private final Service302 service;

    public Endpoint302Resource(Service302 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema302 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
