package fr.spacefox.perftests.quarkus.rest.endpoint448;

import fr.spacefox.perftests.quarkus.core.service448.Service448;
import fr.spacefox.perftests.quarkus.rest.endpoint448.schema.Schema448;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint448")
public class Endpoint448Resource {

    private final Service448 service;

    public Endpoint448Resource(Service448 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema448 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
