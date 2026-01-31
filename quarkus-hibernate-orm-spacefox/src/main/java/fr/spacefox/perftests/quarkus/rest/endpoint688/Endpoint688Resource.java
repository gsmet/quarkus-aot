package fr.spacefox.perftests.quarkus.rest.endpoint688;

import fr.spacefox.perftests.quarkus.core.service688.Service688;
import fr.spacefox.perftests.quarkus.rest.endpoint688.schema.Schema688;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint688")
public class Endpoint688Resource {

    private final Service688 service;

    public Endpoint688Resource(Service688 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema688 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
