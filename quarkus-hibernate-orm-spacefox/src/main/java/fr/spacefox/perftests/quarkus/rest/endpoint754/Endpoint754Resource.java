package fr.spacefox.perftests.quarkus.rest.endpoint754;

import fr.spacefox.perftests.quarkus.core.service754.Service754;
import fr.spacefox.perftests.quarkus.rest.endpoint754.schema.Schema754;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint754")
public class Endpoint754Resource {

    private final Service754 service;

    public Endpoint754Resource(Service754 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema754 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
