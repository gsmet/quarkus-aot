package fr.spacefox.perftests.quarkus.rest.endpoint259;

import fr.spacefox.perftests.quarkus.core.service259.Service259;
import fr.spacefox.perftests.quarkus.rest.endpoint259.schema.Schema259;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint259")
public class Endpoint259Resource {

    private final Service259 service;

    public Endpoint259Resource(Service259 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema259 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
