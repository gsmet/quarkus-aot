package fr.spacefox.perftests.quarkus.rest.endpoint814;

import fr.spacefox.perftests.quarkus.core.service814.Service814;
import fr.spacefox.perftests.quarkus.rest.endpoint814.schema.Schema814;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint814")
public class Endpoint814Resource {

    private final Service814 service;

    public Endpoint814Resource(Service814 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema814 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
