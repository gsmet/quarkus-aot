package fr.spacefox.perftests.quarkus.rest.endpoint961;

import fr.spacefox.perftests.quarkus.core.service961.Service961;
import fr.spacefox.perftests.quarkus.rest.endpoint961.schema.Schema961;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint961")
public class Endpoint961Resource {

    private final Service961 service;

    public Endpoint961Resource(Service961 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema961 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
