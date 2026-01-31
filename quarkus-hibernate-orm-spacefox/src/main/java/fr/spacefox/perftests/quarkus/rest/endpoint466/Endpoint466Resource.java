package fr.spacefox.perftests.quarkus.rest.endpoint466;

import fr.spacefox.perftests.quarkus.core.service466.Service466;
import fr.spacefox.perftests.quarkus.rest.endpoint466.schema.Schema466;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint466")
public class Endpoint466Resource {

    private final Service466 service;

    public Endpoint466Resource(Service466 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema466 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
