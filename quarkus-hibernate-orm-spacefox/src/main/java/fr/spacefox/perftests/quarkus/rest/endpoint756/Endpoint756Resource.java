package fr.spacefox.perftests.quarkus.rest.endpoint756;

import fr.spacefox.perftests.quarkus.core.service756.Service756;
import fr.spacefox.perftests.quarkus.rest.endpoint756.schema.Schema756;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint756")
public class Endpoint756Resource {

    private final Service756 service;

    public Endpoint756Resource(Service756 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema756 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
