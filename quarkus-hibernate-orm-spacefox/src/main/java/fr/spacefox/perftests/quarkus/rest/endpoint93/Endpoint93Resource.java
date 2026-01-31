package fr.spacefox.perftests.quarkus.rest.endpoint93;

import fr.spacefox.perftests.quarkus.core.service93.Service93;
import fr.spacefox.perftests.quarkus.rest.endpoint93.schema.Schema93;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint93")
public class Endpoint93Resource {

    private final Service93 service;

    public Endpoint93Resource(Service93 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema93 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
