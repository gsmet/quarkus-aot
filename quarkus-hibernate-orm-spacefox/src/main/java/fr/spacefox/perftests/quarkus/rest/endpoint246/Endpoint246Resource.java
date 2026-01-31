package fr.spacefox.perftests.quarkus.rest.endpoint246;

import fr.spacefox.perftests.quarkus.core.service246.Service246;
import fr.spacefox.perftests.quarkus.rest.endpoint246.schema.Schema246;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint246")
public class Endpoint246Resource {

    private final Service246 service;

    public Endpoint246Resource(Service246 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema246 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
