package fr.spacefox.perftests.quarkus.rest.endpoint169;

import fr.spacefox.perftests.quarkus.core.service169.Service169;
import fr.spacefox.perftests.quarkus.rest.endpoint169.schema.Schema169;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint169")
public class Endpoint169Resource {

    private final Service169 service;

    public Endpoint169Resource(Service169 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema169 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
