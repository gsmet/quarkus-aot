package fr.spacefox.perftests.quarkus.rest.endpoint607;

import fr.spacefox.perftests.quarkus.core.service607.Service607;
import fr.spacefox.perftests.quarkus.rest.endpoint607.schema.Schema607;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint607")
public class Endpoint607Resource {

    private final Service607 service;

    public Endpoint607Resource(Service607 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema607 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
