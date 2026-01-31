package fr.spacefox.perftests.quarkus.rest.endpoint293;

import fr.spacefox.perftests.quarkus.core.service293.Service293;
import fr.spacefox.perftests.quarkus.rest.endpoint293.schema.Schema293;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint293")
public class Endpoint293Resource {

    private final Service293 service;

    public Endpoint293Resource(Service293 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema293 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
