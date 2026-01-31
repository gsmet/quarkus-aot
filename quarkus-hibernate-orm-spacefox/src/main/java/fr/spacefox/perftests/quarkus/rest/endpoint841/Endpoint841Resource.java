package fr.spacefox.perftests.quarkus.rest.endpoint841;

import fr.spacefox.perftests.quarkus.core.service841.Service841;
import fr.spacefox.perftests.quarkus.rest.endpoint841.schema.Schema841;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint841")
public class Endpoint841Resource {

    private final Service841 service;

    public Endpoint841Resource(Service841 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema841 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
