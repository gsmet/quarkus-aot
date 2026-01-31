package fr.spacefox.perftests.quarkus.rest.endpoint115;

import fr.spacefox.perftests.quarkus.core.service115.Service115;
import fr.spacefox.perftests.quarkus.rest.endpoint115.schema.Schema115;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint115")
public class Endpoint115Resource {

    private final Service115 service;

    public Endpoint115Resource(Service115 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema115 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
