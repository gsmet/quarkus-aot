package fr.spacefox.perftests.quarkus.rest.endpoint485;

import fr.spacefox.perftests.quarkus.core.service485.Service485;
import fr.spacefox.perftests.quarkus.rest.endpoint485.schema.Schema485;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint485")
public class Endpoint485Resource {

    private final Service485 service;

    public Endpoint485Resource(Service485 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema485 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
