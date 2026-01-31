package fr.spacefox.perftests.quarkus.rest.endpoint878;

import fr.spacefox.perftests.quarkus.core.service878.Service878;
import fr.spacefox.perftests.quarkus.rest.endpoint878.schema.Schema878;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint878")
public class Endpoint878Resource {

    private final Service878 service;

    public Endpoint878Resource(Service878 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema878 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
