package fr.spacefox.perftests.quarkus.rest.endpoint333;

import fr.spacefox.perftests.quarkus.core.service333.Service333;
import fr.spacefox.perftests.quarkus.rest.endpoint333.schema.Schema333;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint333")
public class Endpoint333Resource {

    private final Service333 service;

    public Endpoint333Resource(Service333 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema333 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
