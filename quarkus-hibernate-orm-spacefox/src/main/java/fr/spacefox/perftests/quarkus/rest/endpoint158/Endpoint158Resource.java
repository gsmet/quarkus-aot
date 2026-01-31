package fr.spacefox.perftests.quarkus.rest.endpoint158;

import fr.spacefox.perftests.quarkus.core.service158.Service158;
import fr.spacefox.perftests.quarkus.rest.endpoint158.schema.Schema158;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint158")
public class Endpoint158Resource {

    private final Service158 service;

    public Endpoint158Resource(Service158 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema158 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
