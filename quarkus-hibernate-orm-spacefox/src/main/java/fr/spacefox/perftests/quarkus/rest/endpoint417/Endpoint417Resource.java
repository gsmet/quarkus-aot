package fr.spacefox.perftests.quarkus.rest.endpoint417;

import fr.spacefox.perftests.quarkus.core.service417.Service417;
import fr.spacefox.perftests.quarkus.rest.endpoint417.schema.Schema417;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint417")
public class Endpoint417Resource {

    private final Service417 service;

    public Endpoint417Resource(Service417 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema417 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
