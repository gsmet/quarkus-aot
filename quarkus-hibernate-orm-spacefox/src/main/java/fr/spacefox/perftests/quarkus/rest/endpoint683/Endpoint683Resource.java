package fr.spacefox.perftests.quarkus.rest.endpoint683;

import fr.spacefox.perftests.quarkus.core.service683.Service683;
import fr.spacefox.perftests.quarkus.rest.endpoint683.schema.Schema683;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint683")
public class Endpoint683Resource {

    private final Service683 service;

    public Endpoint683Resource(Service683 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema683 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
