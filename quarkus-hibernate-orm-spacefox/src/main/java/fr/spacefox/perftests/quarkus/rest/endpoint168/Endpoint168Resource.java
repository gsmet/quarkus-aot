package fr.spacefox.perftests.quarkus.rest.endpoint168;

import fr.spacefox.perftests.quarkus.core.service168.Service168;
import fr.spacefox.perftests.quarkus.rest.endpoint168.schema.Schema168;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint168")
public class Endpoint168Resource {

    private final Service168 service;

    public Endpoint168Resource(Service168 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema168 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
