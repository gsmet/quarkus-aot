package fr.spacefox.perftests.quarkus.rest.endpoint126;

import fr.spacefox.perftests.quarkus.core.service126.Service126;
import fr.spacefox.perftests.quarkus.rest.endpoint126.schema.Schema126;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint126")
public class Endpoint126Resource {

    private final Service126 service;

    public Endpoint126Resource(Service126 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema126 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
