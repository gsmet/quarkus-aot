package fr.spacefox.perftests.quarkus.rest.endpoint21;

import fr.spacefox.perftests.quarkus.core.service21.Service21;
import fr.spacefox.perftests.quarkus.rest.endpoint21.schema.Schema21;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint21")
public class Endpoint21Resource {

    private final Service21 service;

    public Endpoint21Resource(Service21 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema21 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
