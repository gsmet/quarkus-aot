package fr.spacefox.perftests.quarkus.rest.endpoint764;

import fr.spacefox.perftests.quarkus.core.service764.Service764;
import fr.spacefox.perftests.quarkus.rest.endpoint764.schema.Schema764;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint764")
public class Endpoint764Resource {

    private final Service764 service;

    public Endpoint764Resource(Service764 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema764 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
