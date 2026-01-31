package fr.spacefox.perftests.quarkus.rest.endpoint551;

import fr.spacefox.perftests.quarkus.core.service551.Service551;
import fr.spacefox.perftests.quarkus.rest.endpoint551.schema.Schema551;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint551")
public class Endpoint551Resource {

    private final Service551 service;

    public Endpoint551Resource(Service551 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema551 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
