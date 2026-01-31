package fr.spacefox.perftests.quarkus.rest.endpoint728;

import fr.spacefox.perftests.quarkus.core.service728.Service728;
import fr.spacefox.perftests.quarkus.rest.endpoint728.schema.Schema728;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint728")
public class Endpoint728Resource {

    private final Service728 service;

    public Endpoint728Resource(Service728 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema728 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
