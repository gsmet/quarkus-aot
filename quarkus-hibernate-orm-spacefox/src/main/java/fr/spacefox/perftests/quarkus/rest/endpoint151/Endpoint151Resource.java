package fr.spacefox.perftests.quarkus.rest.endpoint151;

import fr.spacefox.perftests.quarkus.core.service151.Service151;
import fr.spacefox.perftests.quarkus.rest.endpoint151.schema.Schema151;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint151")
public class Endpoint151Resource {

    private final Service151 service;

    public Endpoint151Resource(Service151 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema151 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
