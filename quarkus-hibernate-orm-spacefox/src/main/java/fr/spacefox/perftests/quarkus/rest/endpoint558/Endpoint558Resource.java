package fr.spacefox.perftests.quarkus.rest.endpoint558;

import fr.spacefox.perftests.quarkus.core.service558.Service558;
import fr.spacefox.perftests.quarkus.rest.endpoint558.schema.Schema558;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint558")
public class Endpoint558Resource {

    private final Service558 service;

    public Endpoint558Resource(Service558 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema558 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
