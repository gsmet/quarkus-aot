package fr.spacefox.perftests.quarkus.rest.endpoint593;

import fr.spacefox.perftests.quarkus.core.service593.Service593;
import fr.spacefox.perftests.quarkus.rest.endpoint593.schema.Schema593;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint593")
public class Endpoint593Resource {

    private final Service593 service;

    public Endpoint593Resource(Service593 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema593 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
