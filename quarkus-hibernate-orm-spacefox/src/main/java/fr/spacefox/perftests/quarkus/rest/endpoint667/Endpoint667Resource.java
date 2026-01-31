package fr.spacefox.perftests.quarkus.rest.endpoint667;

import fr.spacefox.perftests.quarkus.core.service667.Service667;
import fr.spacefox.perftests.quarkus.rest.endpoint667.schema.Schema667;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint667")
public class Endpoint667Resource {

    private final Service667 service;

    public Endpoint667Resource(Service667 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema667 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
