package fr.spacefox.perftests.quarkus.rest.endpoint549;

import fr.spacefox.perftests.quarkus.core.service549.Service549;
import fr.spacefox.perftests.quarkus.rest.endpoint549.schema.Schema549;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint549")
public class Endpoint549Resource {

    private final Service549 service;

    public Endpoint549Resource(Service549 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema549 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
