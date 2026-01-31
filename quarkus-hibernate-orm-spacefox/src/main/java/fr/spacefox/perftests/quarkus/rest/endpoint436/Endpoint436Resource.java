package fr.spacefox.perftests.quarkus.rest.endpoint436;

import fr.spacefox.perftests.quarkus.core.service436.Service436;
import fr.spacefox.perftests.quarkus.rest.endpoint436.schema.Schema436;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint436")
public class Endpoint436Resource {

    private final Service436 service;

    public Endpoint436Resource(Service436 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema436 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
