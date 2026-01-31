package fr.spacefox.perftests.quarkus.rest.endpoint167;

import fr.spacefox.perftests.quarkus.core.service167.Service167;
import fr.spacefox.perftests.quarkus.rest.endpoint167.schema.Schema167;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint167")
public class Endpoint167Resource {

    private final Service167 service;

    public Endpoint167Resource(Service167 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema167 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
