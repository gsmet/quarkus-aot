package fr.spacefox.perftests.quarkus.rest.endpoint280;

import fr.spacefox.perftests.quarkus.core.service280.Service280;
import fr.spacefox.perftests.quarkus.rest.endpoint280.schema.Schema280;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint280")
public class Endpoint280Resource {

    private final Service280 service;

    public Endpoint280Resource(Service280 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema280 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
