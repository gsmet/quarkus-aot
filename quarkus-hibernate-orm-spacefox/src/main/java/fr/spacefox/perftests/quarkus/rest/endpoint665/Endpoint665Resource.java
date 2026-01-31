package fr.spacefox.perftests.quarkus.rest.endpoint665;

import fr.spacefox.perftests.quarkus.core.service665.Service665;
import fr.spacefox.perftests.quarkus.rest.endpoint665.schema.Schema665;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint665")
public class Endpoint665Resource {

    private final Service665 service;

    public Endpoint665Resource(Service665 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema665 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
