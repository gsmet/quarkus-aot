package fr.spacefox.perftests.quarkus.rest.endpoint581;

import fr.spacefox.perftests.quarkus.core.service581.Service581;
import fr.spacefox.perftests.quarkus.rest.endpoint581.schema.Schema581;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint581")
public class Endpoint581Resource {

    private final Service581 service;

    public Endpoint581Resource(Service581 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema581 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
