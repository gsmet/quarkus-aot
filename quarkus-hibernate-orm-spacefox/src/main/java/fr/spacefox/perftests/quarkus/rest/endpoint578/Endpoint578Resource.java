package fr.spacefox.perftests.quarkus.rest.endpoint578;

import fr.spacefox.perftests.quarkus.core.service578.Service578;
import fr.spacefox.perftests.quarkus.rest.endpoint578.schema.Schema578;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint578")
public class Endpoint578Resource {

    private final Service578 service;

    public Endpoint578Resource(Service578 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema578 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
