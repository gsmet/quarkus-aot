package fr.spacefox.perftests.quarkus.rest.endpoint388;

import fr.spacefox.perftests.quarkus.core.service388.Service388;
import fr.spacefox.perftests.quarkus.rest.endpoint388.schema.Schema388;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint388")
public class Endpoint388Resource {

    private final Service388 service;

    public Endpoint388Resource(Service388 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema388 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
