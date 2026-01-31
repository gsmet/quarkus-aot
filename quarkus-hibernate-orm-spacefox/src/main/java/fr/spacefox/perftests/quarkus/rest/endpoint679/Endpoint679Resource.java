package fr.spacefox.perftests.quarkus.rest.endpoint679;

import fr.spacefox.perftests.quarkus.core.service679.Service679;
import fr.spacefox.perftests.quarkus.rest.endpoint679.schema.Schema679;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint679")
public class Endpoint679Resource {

    private final Service679 service;

    public Endpoint679Resource(Service679 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema679 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
