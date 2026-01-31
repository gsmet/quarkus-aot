package fr.spacefox.perftests.quarkus.rest.endpoint179;

import fr.spacefox.perftests.quarkus.core.service179.Service179;
import fr.spacefox.perftests.quarkus.rest.endpoint179.schema.Schema179;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint179")
public class Endpoint179Resource {

    private final Service179 service;

    public Endpoint179Resource(Service179 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema179 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
