package fr.spacefox.perftests.quarkus.rest.endpoint958;

import fr.spacefox.perftests.quarkus.core.service958.Service958;
import fr.spacefox.perftests.quarkus.rest.endpoint958.schema.Schema958;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint958")
public class Endpoint958Resource {

    private final Service958 service;

    public Endpoint958Resource(Service958 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema958 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
