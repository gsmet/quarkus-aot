package fr.spacefox.perftests.quarkus.rest.endpoint444;

import fr.spacefox.perftests.quarkus.core.service444.Service444;
import fr.spacefox.perftests.quarkus.rest.endpoint444.schema.Schema444;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint444")
public class Endpoint444Resource {

    private final Service444 service;

    public Endpoint444Resource(Service444 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema444 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
