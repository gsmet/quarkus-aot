package fr.spacefox.perftests.quarkus.rest.endpoint836;

import fr.spacefox.perftests.quarkus.core.service836.Service836;
import fr.spacefox.perftests.quarkus.rest.endpoint836.schema.Schema836;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint836")
public class Endpoint836Resource {

    private final Service836 service;

    public Endpoint836Resource(Service836 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema836 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
