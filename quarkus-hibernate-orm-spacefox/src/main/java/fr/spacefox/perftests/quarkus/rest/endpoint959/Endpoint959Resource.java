package fr.spacefox.perftests.quarkus.rest.endpoint959;

import fr.spacefox.perftests.quarkus.core.service959.Service959;
import fr.spacefox.perftests.quarkus.rest.endpoint959.schema.Schema959;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint959")
public class Endpoint959Resource {

    private final Service959 service;

    public Endpoint959Resource(Service959 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema959 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
