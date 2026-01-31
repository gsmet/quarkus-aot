package fr.spacefox.perftests.quarkus.rest.endpoint150;

import fr.spacefox.perftests.quarkus.core.service150.Service150;
import fr.spacefox.perftests.quarkus.rest.endpoint150.schema.Schema150;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint150")
public class Endpoint150Resource {

    private final Service150 service;

    public Endpoint150Resource(Service150 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema150 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
