package fr.spacefox.perftests.quarkus.rest.endpoint229;

import fr.spacefox.perftests.quarkus.core.service229.Service229;
import fr.spacefox.perftests.quarkus.rest.endpoint229.schema.Schema229;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint229")
public class Endpoint229Resource {

    private final Service229 service;

    public Endpoint229Resource(Service229 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema229 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
