package fr.spacefox.perftests.quarkus.rest.endpoint495;

import fr.spacefox.perftests.quarkus.core.service495.Service495;
import fr.spacefox.perftests.quarkus.rest.endpoint495.schema.Schema495;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint495")
public class Endpoint495Resource {

    private final Service495 service;

    public Endpoint495Resource(Service495 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema495 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
