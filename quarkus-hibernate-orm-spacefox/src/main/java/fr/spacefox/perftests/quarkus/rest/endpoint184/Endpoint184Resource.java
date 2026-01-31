package fr.spacefox.perftests.quarkus.rest.endpoint184;

import fr.spacefox.perftests.quarkus.core.service184.Service184;
import fr.spacefox.perftests.quarkus.rest.endpoint184.schema.Schema184;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint184")
public class Endpoint184Resource {

    private final Service184 service;

    public Endpoint184Resource(Service184 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema184 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
