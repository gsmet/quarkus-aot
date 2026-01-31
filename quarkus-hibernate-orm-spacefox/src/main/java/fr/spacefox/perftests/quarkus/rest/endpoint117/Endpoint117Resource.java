package fr.spacefox.perftests.quarkus.rest.endpoint117;

import fr.spacefox.perftests.quarkus.core.service117.Service117;
import fr.spacefox.perftests.quarkus.rest.endpoint117.schema.Schema117;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint117")
public class Endpoint117Resource {

    private final Service117 service;

    public Endpoint117Resource(Service117 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema117 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
