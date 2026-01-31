package fr.spacefox.perftests.quarkus.rest.endpoint880;

import fr.spacefox.perftests.quarkus.core.service880.Service880;
import fr.spacefox.perftests.quarkus.rest.endpoint880.schema.Schema880;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint880")
public class Endpoint880Resource {

    private final Service880 service;

    public Endpoint880Resource(Service880 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema880 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
