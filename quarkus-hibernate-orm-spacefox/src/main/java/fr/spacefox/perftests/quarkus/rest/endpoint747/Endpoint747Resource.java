package fr.spacefox.perftests.quarkus.rest.endpoint747;

import fr.spacefox.perftests.quarkus.core.service747.Service747;
import fr.spacefox.perftests.quarkus.rest.endpoint747.schema.Schema747;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint747")
public class Endpoint747Resource {

    private final Service747 service;

    public Endpoint747Resource(Service747 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema747 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
