package fr.spacefox.perftests.quarkus.rest.endpoint768;

import fr.spacefox.perftests.quarkus.core.service768.Service768;
import fr.spacefox.perftests.quarkus.rest.endpoint768.schema.Schema768;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint768")
public class Endpoint768Resource {

    private final Service768 service;

    public Endpoint768Resource(Service768 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema768 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
