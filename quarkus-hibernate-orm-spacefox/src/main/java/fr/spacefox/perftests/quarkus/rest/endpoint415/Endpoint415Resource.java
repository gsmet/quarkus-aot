package fr.spacefox.perftests.quarkus.rest.endpoint415;

import fr.spacefox.perftests.quarkus.core.service415.Service415;
import fr.spacefox.perftests.quarkus.rest.endpoint415.schema.Schema415;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint415")
public class Endpoint415Resource {

    private final Service415 service;

    public Endpoint415Resource(Service415 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema415 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
