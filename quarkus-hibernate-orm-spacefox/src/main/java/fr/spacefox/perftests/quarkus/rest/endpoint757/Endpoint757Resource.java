package fr.spacefox.perftests.quarkus.rest.endpoint757;

import fr.spacefox.perftests.quarkus.core.service757.Service757;
import fr.spacefox.perftests.quarkus.rest.endpoint757.schema.Schema757;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint757")
public class Endpoint757Resource {

    private final Service757 service;

    public Endpoint757Resource(Service757 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema757 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
