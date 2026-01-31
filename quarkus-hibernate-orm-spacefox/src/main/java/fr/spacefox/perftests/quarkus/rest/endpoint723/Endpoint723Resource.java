package fr.spacefox.perftests.quarkus.rest.endpoint723;

import fr.spacefox.perftests.quarkus.core.service723.Service723;
import fr.spacefox.perftests.quarkus.rest.endpoint723.schema.Schema723;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint723")
public class Endpoint723Resource {

    private final Service723 service;

    public Endpoint723Resource(Service723 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema723 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
