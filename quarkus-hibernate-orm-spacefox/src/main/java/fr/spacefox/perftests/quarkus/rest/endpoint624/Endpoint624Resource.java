package fr.spacefox.perftests.quarkus.rest.endpoint624;

import fr.spacefox.perftests.quarkus.core.service624.Service624;
import fr.spacefox.perftests.quarkus.rest.endpoint624.schema.Schema624;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint624")
public class Endpoint624Resource {

    private final Service624 service;

    public Endpoint624Resource(Service624 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema624 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
