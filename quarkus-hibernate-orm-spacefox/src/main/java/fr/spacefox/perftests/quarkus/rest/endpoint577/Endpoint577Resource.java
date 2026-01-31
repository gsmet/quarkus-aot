package fr.spacefox.perftests.quarkus.rest.endpoint577;

import fr.spacefox.perftests.quarkus.core.service577.Service577;
import fr.spacefox.perftests.quarkus.rest.endpoint577.schema.Schema577;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint577")
public class Endpoint577Resource {

    private final Service577 service;

    public Endpoint577Resource(Service577 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema577 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
