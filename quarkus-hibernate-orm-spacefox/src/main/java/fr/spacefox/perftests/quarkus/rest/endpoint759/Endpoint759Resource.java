package fr.spacefox.perftests.quarkus.rest.endpoint759;

import fr.spacefox.perftests.quarkus.core.service759.Service759;
import fr.spacefox.perftests.quarkus.rest.endpoint759.schema.Schema759;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint759")
public class Endpoint759Resource {

    private final Service759 service;

    public Endpoint759Resource(Service759 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema759 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
