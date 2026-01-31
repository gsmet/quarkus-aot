package fr.spacefox.perftests.quarkus.rest.endpoint583;

import fr.spacefox.perftests.quarkus.core.service583.Service583;
import fr.spacefox.perftests.quarkus.rest.endpoint583.schema.Schema583;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint583")
public class Endpoint583Resource {

    private final Service583 service;

    public Endpoint583Resource(Service583 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema583 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
