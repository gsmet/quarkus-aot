package fr.spacefox.perftests.quarkus.rest.endpoint391;

import fr.spacefox.perftests.quarkus.core.service391.Service391;
import fr.spacefox.perftests.quarkus.rest.endpoint391.schema.Schema391;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint391")
public class Endpoint391Resource {

    private final Service391 service;

    public Endpoint391Resource(Service391 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema391 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
