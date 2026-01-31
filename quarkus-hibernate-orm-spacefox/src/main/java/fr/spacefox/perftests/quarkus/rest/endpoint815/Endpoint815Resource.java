package fr.spacefox.perftests.quarkus.rest.endpoint815;

import fr.spacefox.perftests.quarkus.core.service815.Service815;
import fr.spacefox.perftests.quarkus.rest.endpoint815.schema.Schema815;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint815")
public class Endpoint815Resource {

    private final Service815 service;

    public Endpoint815Resource(Service815 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema815 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
