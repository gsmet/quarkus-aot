package fr.spacefox.perftests.quarkus.rest.endpoint398;

import fr.spacefox.perftests.quarkus.core.service398.Service398;
import fr.spacefox.perftests.quarkus.rest.endpoint398.schema.Schema398;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint398")
public class Endpoint398Resource {

    private final Service398 service;

    public Endpoint398Resource(Service398 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema398 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
