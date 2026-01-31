package fr.spacefox.perftests.quarkus.rest.endpoint916;

import fr.spacefox.perftests.quarkus.core.service916.Service916;
import fr.spacefox.perftests.quarkus.rest.endpoint916.schema.Schema916;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint916")
public class Endpoint916Resource {

    private final Service916 service;

    public Endpoint916Resource(Service916 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema916 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
