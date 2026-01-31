package fr.spacefox.perftests.quarkus.rest.endpoint858;

import fr.spacefox.perftests.quarkus.core.service858.Service858;
import fr.spacefox.perftests.quarkus.rest.endpoint858.schema.Schema858;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint858")
public class Endpoint858Resource {

    private final Service858 service;

    public Endpoint858Resource(Service858 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema858 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
