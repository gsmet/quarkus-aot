package fr.spacefox.perftests.quarkus.rest.endpoint316;

import fr.spacefox.perftests.quarkus.core.service316.Service316;
import fr.spacefox.perftests.quarkus.rest.endpoint316.schema.Schema316;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint316")
public class Endpoint316Resource {

    private final Service316 service;

    public Endpoint316Resource(Service316 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema316 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
