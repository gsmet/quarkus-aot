package fr.spacefox.perftests.quarkus.rest.endpoint231;

import fr.spacefox.perftests.quarkus.core.service231.Service231;
import fr.spacefox.perftests.quarkus.rest.endpoint231.schema.Schema231;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint231")
public class Endpoint231Resource {

    private final Service231 service;

    public Endpoint231Resource(Service231 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema231 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
