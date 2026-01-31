package fr.spacefox.perftests.quarkus.rest.endpoint338;

import fr.spacefox.perftests.quarkus.core.service338.Service338;
import fr.spacefox.perftests.quarkus.rest.endpoint338.schema.Schema338;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint338")
public class Endpoint338Resource {

    private final Service338 service;

    public Endpoint338Resource(Service338 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema338 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
