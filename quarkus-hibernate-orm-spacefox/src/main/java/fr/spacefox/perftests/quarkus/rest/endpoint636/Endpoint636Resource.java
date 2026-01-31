package fr.spacefox.perftests.quarkus.rest.endpoint636;

import fr.spacefox.perftests.quarkus.core.service636.Service636;
import fr.spacefox.perftests.quarkus.rest.endpoint636.schema.Schema636;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint636")
public class Endpoint636Resource {

    private final Service636 service;

    public Endpoint636Resource(Service636 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema636 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
