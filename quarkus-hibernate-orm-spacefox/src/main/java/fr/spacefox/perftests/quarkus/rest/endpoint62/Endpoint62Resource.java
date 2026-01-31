package fr.spacefox.perftests.quarkus.rest.endpoint62;

import fr.spacefox.perftests.quarkus.core.service62.Service62;
import fr.spacefox.perftests.quarkus.rest.endpoint62.schema.Schema62;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint62")
public class Endpoint62Resource {

    private final Service62 service;

    public Endpoint62Resource(Service62 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema62 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
