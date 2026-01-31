package fr.spacefox.perftests.quarkus.rest.endpoint506;

import fr.spacefox.perftests.quarkus.core.service506.Service506;
import fr.spacefox.perftests.quarkus.rest.endpoint506.schema.Schema506;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint506")
public class Endpoint506Resource {

    private final Service506 service;

    public Endpoint506Resource(Service506 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema506 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
