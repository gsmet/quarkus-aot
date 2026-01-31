package fr.spacefox.perftests.quarkus.rest.endpoint608;

import fr.spacefox.perftests.quarkus.core.service608.Service608;
import fr.spacefox.perftests.quarkus.rest.endpoint608.schema.Schema608;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint608")
public class Endpoint608Resource {

    private final Service608 service;

    public Endpoint608Resource(Service608 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema608 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
