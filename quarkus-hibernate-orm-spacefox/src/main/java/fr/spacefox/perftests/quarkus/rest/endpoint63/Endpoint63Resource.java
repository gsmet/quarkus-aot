package fr.spacefox.perftests.quarkus.rest.endpoint63;

import fr.spacefox.perftests.quarkus.core.service63.Service63;
import fr.spacefox.perftests.quarkus.rest.endpoint63.schema.Schema63;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint63")
public class Endpoint63Resource {

    private final Service63 service;

    public Endpoint63Resource(Service63 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema63 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
