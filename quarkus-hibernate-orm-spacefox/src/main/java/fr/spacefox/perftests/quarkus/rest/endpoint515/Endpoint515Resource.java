package fr.spacefox.perftests.quarkus.rest.endpoint515;

import fr.spacefox.perftests.quarkus.core.service515.Service515;
import fr.spacefox.perftests.quarkus.rest.endpoint515.schema.Schema515;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint515")
public class Endpoint515Resource {

    private final Service515 service;

    public Endpoint515Resource(Service515 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema515 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
