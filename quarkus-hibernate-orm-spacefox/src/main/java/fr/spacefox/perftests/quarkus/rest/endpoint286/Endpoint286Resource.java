package fr.spacefox.perftests.quarkus.rest.endpoint286;

import fr.spacefox.perftests.quarkus.core.service286.Service286;
import fr.spacefox.perftests.quarkus.rest.endpoint286.schema.Schema286;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint286")
public class Endpoint286Resource {

    private final Service286 service;

    public Endpoint286Resource(Service286 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema286 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
