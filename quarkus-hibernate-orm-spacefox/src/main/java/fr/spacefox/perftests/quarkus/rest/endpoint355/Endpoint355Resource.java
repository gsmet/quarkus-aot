package fr.spacefox.perftests.quarkus.rest.endpoint355;

import fr.spacefox.perftests.quarkus.core.service355.Service355;
import fr.spacefox.perftests.quarkus.rest.endpoint355.schema.Schema355;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint355")
public class Endpoint355Resource {

    private final Service355 service;

    public Endpoint355Resource(Service355 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema355 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
