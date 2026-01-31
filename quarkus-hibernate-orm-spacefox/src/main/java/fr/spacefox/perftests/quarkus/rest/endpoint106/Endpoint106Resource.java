package fr.spacefox.perftests.quarkus.rest.endpoint106;

import fr.spacefox.perftests.quarkus.core.service106.Service106;
import fr.spacefox.perftests.quarkus.rest.endpoint106.schema.Schema106;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint106")
public class Endpoint106Resource {

    private final Service106 service;

    public Endpoint106Resource(Service106 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema106 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
