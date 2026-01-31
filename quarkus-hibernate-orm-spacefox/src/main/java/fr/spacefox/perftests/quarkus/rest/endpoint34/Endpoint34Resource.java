package fr.spacefox.perftests.quarkus.rest.endpoint34;

import fr.spacefox.perftests.quarkus.core.service34.Service34;
import fr.spacefox.perftests.quarkus.rest.endpoint34.schema.Schema34;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint34")
public class Endpoint34Resource {

    private final Service34 service;

    public Endpoint34Resource(Service34 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema34 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
