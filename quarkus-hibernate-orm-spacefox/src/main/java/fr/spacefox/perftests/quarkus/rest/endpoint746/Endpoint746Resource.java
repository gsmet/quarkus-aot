package fr.spacefox.perftests.quarkus.rest.endpoint746;

import fr.spacefox.perftests.quarkus.core.service746.Service746;
import fr.spacefox.perftests.quarkus.rest.endpoint746.schema.Schema746;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint746")
public class Endpoint746Resource {

    private final Service746 service;

    public Endpoint746Resource(Service746 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema746 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
