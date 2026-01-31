package fr.spacefox.perftests.quarkus.rest.endpoint138;

import fr.spacefox.perftests.quarkus.core.service138.Service138;
import fr.spacefox.perftests.quarkus.rest.endpoint138.schema.Schema138;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint138")
public class Endpoint138Resource {

    private final Service138 service;

    public Endpoint138Resource(Service138 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema138 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
