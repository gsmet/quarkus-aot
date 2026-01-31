package fr.spacefox.perftests.quarkus.rest.endpoint804;

import fr.spacefox.perftests.quarkus.core.service804.Service804;
import fr.spacefox.perftests.quarkus.rest.endpoint804.schema.Schema804;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint804")
public class Endpoint804Resource {

    private final Service804 service;

    public Endpoint804Resource(Service804 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema804 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
