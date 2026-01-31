package fr.spacefox.perftests.quarkus.rest.endpoint401;

import fr.spacefox.perftests.quarkus.core.service401.Service401;
import fr.spacefox.perftests.quarkus.rest.endpoint401.schema.Schema401;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint401")
public class Endpoint401Resource {

    private final Service401 service;

    public Endpoint401Resource(Service401 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema401 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
