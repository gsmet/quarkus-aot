package fr.spacefox.perftests.quarkus.rest.endpoint196;

import fr.spacefox.perftests.quarkus.core.service196.Service196;
import fr.spacefox.perftests.quarkus.rest.endpoint196.schema.Schema196;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint196")
public class Endpoint196Resource {

    private final Service196 service;

    public Endpoint196Resource(Service196 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema196 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
