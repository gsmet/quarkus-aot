package fr.spacefox.perftests.quarkus.rest.endpoint149;

import fr.spacefox.perftests.quarkus.core.service149.Service149;
import fr.spacefox.perftests.quarkus.rest.endpoint149.schema.Schema149;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint149")
public class Endpoint149Resource {

    private final Service149 service;

    public Endpoint149Resource(Service149 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema149 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
