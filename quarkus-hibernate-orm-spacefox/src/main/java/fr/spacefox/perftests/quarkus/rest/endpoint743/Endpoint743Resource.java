package fr.spacefox.perftests.quarkus.rest.endpoint743;

import fr.spacefox.perftests.quarkus.core.service743.Service743;
import fr.spacefox.perftests.quarkus.rest.endpoint743.schema.Schema743;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint743")
public class Endpoint743Resource {

    private final Service743 service;

    public Endpoint743Resource(Service743 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema743 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
