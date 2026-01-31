package fr.spacefox.perftests.quarkus.rest.endpoint472;

import fr.spacefox.perftests.quarkus.core.service472.Service472;
import fr.spacefox.perftests.quarkus.rest.endpoint472.schema.Schema472;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint472")
public class Endpoint472Resource {

    private final Service472 service;

    public Endpoint472Resource(Service472 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema472 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
