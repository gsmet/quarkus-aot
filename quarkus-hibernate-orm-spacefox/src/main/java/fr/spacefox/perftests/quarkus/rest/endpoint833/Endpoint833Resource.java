package fr.spacefox.perftests.quarkus.rest.endpoint833;

import fr.spacefox.perftests.quarkus.core.service833.Service833;
import fr.spacefox.perftests.quarkus.rest.endpoint833.schema.Schema833;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint833")
public class Endpoint833Resource {

    private final Service833 service;

    public Endpoint833Resource(Service833 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema833 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
