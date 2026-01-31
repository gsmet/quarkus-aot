package fr.spacefox.perftests.quarkus.rest.endpoint114;

import fr.spacefox.perftests.quarkus.core.service114.Service114;
import fr.spacefox.perftests.quarkus.rest.endpoint114.schema.Schema114;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint114")
public class Endpoint114Resource {

    private final Service114 service;

    public Endpoint114Resource(Service114 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema114 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
