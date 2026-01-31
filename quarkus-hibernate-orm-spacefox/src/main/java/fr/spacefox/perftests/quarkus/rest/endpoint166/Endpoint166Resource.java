package fr.spacefox.perftests.quarkus.rest.endpoint166;

import fr.spacefox.perftests.quarkus.core.service166.Service166;
import fr.spacefox.perftests.quarkus.rest.endpoint166.schema.Schema166;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint166")
public class Endpoint166Resource {

    private final Service166 service;

    public Endpoint166Resource(Service166 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema166 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
