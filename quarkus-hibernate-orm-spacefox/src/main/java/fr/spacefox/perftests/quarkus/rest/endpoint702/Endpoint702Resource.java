package fr.spacefox.perftests.quarkus.rest.endpoint702;

import fr.spacefox.perftests.quarkus.core.service702.Service702;
import fr.spacefox.perftests.quarkus.rest.endpoint702.schema.Schema702;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint702")
public class Endpoint702Resource {

    private final Service702 service;

    public Endpoint702Resource(Service702 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema702 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
