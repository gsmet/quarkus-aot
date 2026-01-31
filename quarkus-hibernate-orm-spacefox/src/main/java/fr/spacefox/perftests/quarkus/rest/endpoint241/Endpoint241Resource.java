package fr.spacefox.perftests.quarkus.rest.endpoint241;

import fr.spacefox.perftests.quarkus.core.service241.Service241;
import fr.spacefox.perftests.quarkus.rest.endpoint241.schema.Schema241;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint241")
public class Endpoint241Resource {

    private final Service241 service;

    public Endpoint241Resource(Service241 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema241 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
