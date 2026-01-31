package fr.spacefox.perftests.quarkus.rest.endpoint729;

import fr.spacefox.perftests.quarkus.core.service729.Service729;
import fr.spacefox.perftests.quarkus.rest.endpoint729.schema.Schema729;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint729")
public class Endpoint729Resource {

    private final Service729 service;

    public Endpoint729Resource(Service729 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema729 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
