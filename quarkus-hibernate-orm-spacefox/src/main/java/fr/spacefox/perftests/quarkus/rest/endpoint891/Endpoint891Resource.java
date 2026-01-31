package fr.spacefox.perftests.quarkus.rest.endpoint891;

import fr.spacefox.perftests.quarkus.core.service891.Service891;
import fr.spacefox.perftests.quarkus.rest.endpoint891.schema.Schema891;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint891")
public class Endpoint891Resource {

    private final Service891 service;

    public Endpoint891Resource(Service891 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema891 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
