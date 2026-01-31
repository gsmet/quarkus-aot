package fr.spacefox.perftests.quarkus.rest.endpoint141;

import fr.spacefox.perftests.quarkus.core.service141.Service141;
import fr.spacefox.perftests.quarkus.rest.endpoint141.schema.Schema141;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint141")
public class Endpoint141Resource {

    private final Service141 service;

    public Endpoint141Resource(Service141 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema141 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
