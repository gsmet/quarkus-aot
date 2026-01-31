package fr.spacefox.perftests.quarkus.rest.endpoint157;

import fr.spacefox.perftests.quarkus.core.service157.Service157;
import fr.spacefox.perftests.quarkus.rest.endpoint157.schema.Schema157;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint157")
public class Endpoint157Resource {

    private final Service157 service;

    public Endpoint157Resource(Service157 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema157 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
