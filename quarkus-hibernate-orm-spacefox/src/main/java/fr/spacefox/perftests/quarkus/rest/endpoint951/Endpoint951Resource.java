package fr.spacefox.perftests.quarkus.rest.endpoint951;

import fr.spacefox.perftests.quarkus.core.service951.Service951;
import fr.spacefox.perftests.quarkus.rest.endpoint951.schema.Schema951;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint951")
public class Endpoint951Resource {

    private final Service951 service;

    public Endpoint951Resource(Service951 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema951 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
