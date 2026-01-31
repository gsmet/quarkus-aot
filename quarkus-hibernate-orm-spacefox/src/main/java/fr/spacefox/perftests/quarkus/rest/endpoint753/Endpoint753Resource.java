package fr.spacefox.perftests.quarkus.rest.endpoint753;

import fr.spacefox.perftests.quarkus.core.service753.Service753;
import fr.spacefox.perftests.quarkus.rest.endpoint753.schema.Schema753;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint753")
public class Endpoint753Resource {

    private final Service753 service;

    public Endpoint753Resource(Service753 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema753 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
