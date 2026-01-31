package fr.spacefox.perftests.quarkus.rest.endpoint654;

import fr.spacefox.perftests.quarkus.core.service654.Service654;
import fr.spacefox.perftests.quarkus.rest.endpoint654.schema.Schema654;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint654")
public class Endpoint654Resource {

    private final Service654 service;

    public Endpoint654Resource(Service654 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema654 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
