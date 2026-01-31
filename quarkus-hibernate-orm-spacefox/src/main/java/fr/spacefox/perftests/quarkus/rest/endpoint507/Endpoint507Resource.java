package fr.spacefox.perftests.quarkus.rest.endpoint507;

import fr.spacefox.perftests.quarkus.core.service507.Service507;
import fr.spacefox.perftests.quarkus.rest.endpoint507.schema.Schema507;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint507")
public class Endpoint507Resource {

    private final Service507 service;

    public Endpoint507Resource(Service507 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema507 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
