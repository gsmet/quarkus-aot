package fr.spacefox.perftests.quarkus.rest.endpoint585;

import fr.spacefox.perftests.quarkus.core.service585.Service585;
import fr.spacefox.perftests.quarkus.rest.endpoint585.schema.Schema585;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint585")
public class Endpoint585Resource {

    private final Service585 service;

    public Endpoint585Resource(Service585 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema585 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
