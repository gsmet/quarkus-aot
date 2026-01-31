package fr.spacefox.perftests.quarkus.rest.endpoint76;

import fr.spacefox.perftests.quarkus.core.service76.Service76;
import fr.spacefox.perftests.quarkus.rest.endpoint76.schema.Schema76;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint76")
public class Endpoint76Resource {

    private final Service76 service;

    public Endpoint76Resource(Service76 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema76 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
