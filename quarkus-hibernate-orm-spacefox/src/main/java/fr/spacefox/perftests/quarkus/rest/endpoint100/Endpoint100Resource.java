package fr.spacefox.perftests.quarkus.rest.endpoint100;

import fr.spacefox.perftests.quarkus.core.service100.Service100;
import fr.spacefox.perftests.quarkus.rest.endpoint100.schema.Schema100;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint100")
public class Endpoint100Resource {

    private final Service100 service;

    public Endpoint100Resource(Service100 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema100 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
