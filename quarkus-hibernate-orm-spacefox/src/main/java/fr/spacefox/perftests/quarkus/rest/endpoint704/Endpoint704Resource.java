package fr.spacefox.perftests.quarkus.rest.endpoint704;

import fr.spacefox.perftests.quarkus.core.service704.Service704;
import fr.spacefox.perftests.quarkus.rest.endpoint704.schema.Schema704;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint704")
public class Endpoint704Resource {

    private final Service704 service;

    public Endpoint704Resource(Service704 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema704 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
