package fr.spacefox.perftests.quarkus.rest.endpoint125;

import fr.spacefox.perftests.quarkus.core.service125.Service125;
import fr.spacefox.perftests.quarkus.rest.endpoint125.schema.Schema125;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint125")
public class Endpoint125Resource {

    private final Service125 service;

    public Endpoint125Resource(Service125 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema125 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
