package fr.spacefox.perftests.quarkus.rest.endpoint32;

import fr.spacefox.perftests.quarkus.core.service32.Service32;
import fr.spacefox.perftests.quarkus.rest.endpoint32.schema.Schema32;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint32")
public class Endpoint32Resource {

    private final Service32 service;

    public Endpoint32Resource(Service32 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema32 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
