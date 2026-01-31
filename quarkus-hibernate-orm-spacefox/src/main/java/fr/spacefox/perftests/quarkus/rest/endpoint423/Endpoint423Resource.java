package fr.spacefox.perftests.quarkus.rest.endpoint423;

import fr.spacefox.perftests.quarkus.core.service423.Service423;
import fr.spacefox.perftests.quarkus.rest.endpoint423.schema.Schema423;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint423")
public class Endpoint423Resource {

    private final Service423 service;

    public Endpoint423Resource(Service423 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema423 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
