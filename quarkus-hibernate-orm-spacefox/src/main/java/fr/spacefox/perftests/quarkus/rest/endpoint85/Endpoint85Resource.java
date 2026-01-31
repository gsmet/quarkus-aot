package fr.spacefox.perftests.quarkus.rest.endpoint85;

import fr.spacefox.perftests.quarkus.core.service85.Service85;
import fr.spacefox.perftests.quarkus.rest.endpoint85.schema.Schema85;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint85")
public class Endpoint85Resource {

    private final Service85 service;

    public Endpoint85Resource(Service85 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema85 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
