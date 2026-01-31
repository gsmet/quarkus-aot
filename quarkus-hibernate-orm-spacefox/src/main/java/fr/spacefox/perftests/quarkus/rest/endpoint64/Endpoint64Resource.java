package fr.spacefox.perftests.quarkus.rest.endpoint64;

import fr.spacefox.perftests.quarkus.core.service64.Service64;
import fr.spacefox.perftests.quarkus.rest.endpoint64.schema.Schema64;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint64")
public class Endpoint64Resource {

    private final Service64 service;

    public Endpoint64Resource(Service64 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema64 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
