package fr.spacefox.perftests.quarkus.rest.endpoint513;

import fr.spacefox.perftests.quarkus.core.service513.Service513;
import fr.spacefox.perftests.quarkus.rest.endpoint513.schema.Schema513;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint513")
public class Endpoint513Resource {

    private final Service513 service;

    public Endpoint513Resource(Service513 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema513 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
