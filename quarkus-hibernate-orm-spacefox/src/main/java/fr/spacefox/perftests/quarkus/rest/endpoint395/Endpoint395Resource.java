package fr.spacefox.perftests.quarkus.rest.endpoint395;

import fr.spacefox.perftests.quarkus.core.service395.Service395;
import fr.spacefox.perftests.quarkus.rest.endpoint395.schema.Schema395;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint395")
public class Endpoint395Resource {

    private final Service395 service;

    public Endpoint395Resource(Service395 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema395 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
