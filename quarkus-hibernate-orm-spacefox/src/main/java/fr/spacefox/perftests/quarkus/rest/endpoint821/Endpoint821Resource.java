package fr.spacefox.perftests.quarkus.rest.endpoint821;

import fr.spacefox.perftests.quarkus.core.service821.Service821;
import fr.spacefox.perftests.quarkus.rest.endpoint821.schema.Schema821;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint821")
public class Endpoint821Resource {

    private final Service821 service;

    public Endpoint821Resource(Service821 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema821 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
