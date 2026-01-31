package fr.spacefox.perftests.quarkus.rest.endpoint889;

import fr.spacefox.perftests.quarkus.core.service889.Service889;
import fr.spacefox.perftests.quarkus.rest.endpoint889.schema.Schema889;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint889")
public class Endpoint889Resource {

    private final Service889 service;

    public Endpoint889Resource(Service889 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema889 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
