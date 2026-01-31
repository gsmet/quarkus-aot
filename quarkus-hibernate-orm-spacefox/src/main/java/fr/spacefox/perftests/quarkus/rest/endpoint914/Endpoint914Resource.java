package fr.spacefox.perftests.quarkus.rest.endpoint914;

import fr.spacefox.perftests.quarkus.core.service914.Service914;
import fr.spacefox.perftests.quarkus.rest.endpoint914.schema.Schema914;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint914")
public class Endpoint914Resource {

    private final Service914 service;

    public Endpoint914Resource(Service914 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema914 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
