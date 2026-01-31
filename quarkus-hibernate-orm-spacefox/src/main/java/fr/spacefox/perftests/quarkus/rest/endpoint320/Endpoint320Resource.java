package fr.spacefox.perftests.quarkus.rest.endpoint320;

import fr.spacefox.perftests.quarkus.core.service320.Service320;
import fr.spacefox.perftests.quarkus.rest.endpoint320.schema.Schema320;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint320")
public class Endpoint320Resource {

    private final Service320 service;

    public Endpoint320Resource(Service320 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema320 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
