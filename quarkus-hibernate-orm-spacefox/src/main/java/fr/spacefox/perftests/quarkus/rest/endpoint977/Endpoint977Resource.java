package fr.spacefox.perftests.quarkus.rest.endpoint977;

import fr.spacefox.perftests.quarkus.core.service977.Service977;
import fr.spacefox.perftests.quarkus.rest.endpoint977.schema.Schema977;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint977")
public class Endpoint977Resource {

    private final Service977 service;

    public Endpoint977Resource(Service977 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema977 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
