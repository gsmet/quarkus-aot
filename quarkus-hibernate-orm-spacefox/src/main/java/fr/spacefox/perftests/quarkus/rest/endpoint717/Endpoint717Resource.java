package fr.spacefox.perftests.quarkus.rest.endpoint717;

import fr.spacefox.perftests.quarkus.core.service717.Service717;
import fr.spacefox.perftests.quarkus.rest.endpoint717.schema.Schema717;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint717")
public class Endpoint717Resource {

    private final Service717 service;

    public Endpoint717Resource(Service717 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema717 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
