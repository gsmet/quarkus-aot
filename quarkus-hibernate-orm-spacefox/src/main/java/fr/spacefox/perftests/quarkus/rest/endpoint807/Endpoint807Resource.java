package fr.spacefox.perftests.quarkus.rest.endpoint807;

import fr.spacefox.perftests.quarkus.core.service807.Service807;
import fr.spacefox.perftests.quarkus.rest.endpoint807.schema.Schema807;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint807")
public class Endpoint807Resource {

    private final Service807 service;

    public Endpoint807Resource(Service807 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema807 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
