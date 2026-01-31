package fr.spacefox.perftests.quarkus.rest.endpoint571;

import fr.spacefox.perftests.quarkus.core.service571.Service571;
import fr.spacefox.perftests.quarkus.rest.endpoint571.schema.Schema571;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint571")
public class Endpoint571Resource {

    private final Service571 service;

    public Endpoint571Resource(Service571 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema571 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
