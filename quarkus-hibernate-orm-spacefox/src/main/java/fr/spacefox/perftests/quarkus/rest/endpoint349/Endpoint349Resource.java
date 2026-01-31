package fr.spacefox.perftests.quarkus.rest.endpoint349;

import fr.spacefox.perftests.quarkus.core.service349.Service349;
import fr.spacefox.perftests.quarkus.rest.endpoint349.schema.Schema349;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint349")
public class Endpoint349Resource {

    private final Service349 service;

    public Endpoint349Resource(Service349 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema349 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
