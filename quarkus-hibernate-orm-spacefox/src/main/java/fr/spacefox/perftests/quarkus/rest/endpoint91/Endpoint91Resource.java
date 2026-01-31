package fr.spacefox.perftests.quarkus.rest.endpoint91;

import fr.spacefox.perftests.quarkus.core.service91.Service91;
import fr.spacefox.perftests.quarkus.rest.endpoint91.schema.Schema91;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint91")
public class Endpoint91Resource {

    private final Service91 service;

    public Endpoint91Resource(Service91 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema91 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
