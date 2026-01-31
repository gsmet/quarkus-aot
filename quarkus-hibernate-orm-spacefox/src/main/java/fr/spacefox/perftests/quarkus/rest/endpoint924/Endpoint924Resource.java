package fr.spacefox.perftests.quarkus.rest.endpoint924;

import fr.spacefox.perftests.quarkus.core.service924.Service924;
import fr.spacefox.perftests.quarkus.rest.endpoint924.schema.Schema924;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint924")
public class Endpoint924Resource {

    private final Service924 service;

    public Endpoint924Resource(Service924 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema924 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
