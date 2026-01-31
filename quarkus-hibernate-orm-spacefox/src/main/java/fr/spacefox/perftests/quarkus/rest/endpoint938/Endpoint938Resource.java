package fr.spacefox.perftests.quarkus.rest.endpoint938;

import fr.spacefox.perftests.quarkus.core.service938.Service938;
import fr.spacefox.perftests.quarkus.rest.endpoint938.schema.Schema938;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint938")
public class Endpoint938Resource {

    private final Service938 service;

    public Endpoint938Resource(Service938 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema938 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
