package fr.spacefox.perftests.quarkus.rest.endpoint999;

import fr.spacefox.perftests.quarkus.core.service999.Service999;
import fr.spacefox.perftests.quarkus.rest.endpoint999.schema.Schema999;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint999")
public class Endpoint999Resource {

    private final Service999 service;

    public Endpoint999Resource(Service999 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema999 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
