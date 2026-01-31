package fr.spacefox.perftests.quarkus.rest.endpoint564;

import fr.spacefox.perftests.quarkus.core.service564.Service564;
import fr.spacefox.perftests.quarkus.rest.endpoint564.schema.Schema564;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint564")
public class Endpoint564Resource {

    private final Service564 service;

    public Endpoint564Resource(Service564 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema564 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
