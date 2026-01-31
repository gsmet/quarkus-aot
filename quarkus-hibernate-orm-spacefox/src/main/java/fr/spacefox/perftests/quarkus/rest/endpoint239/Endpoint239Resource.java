package fr.spacefox.perftests.quarkus.rest.endpoint239;

import fr.spacefox.perftests.quarkus.core.service239.Service239;
import fr.spacefox.perftests.quarkus.rest.endpoint239.schema.Schema239;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint239")
public class Endpoint239Resource {

    private final Service239 service;

    public Endpoint239Resource(Service239 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema239 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
