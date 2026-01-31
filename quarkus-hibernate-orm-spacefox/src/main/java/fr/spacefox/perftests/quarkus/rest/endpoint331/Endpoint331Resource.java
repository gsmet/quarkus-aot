package fr.spacefox.perftests.quarkus.rest.endpoint331;

import fr.spacefox.perftests.quarkus.core.service331.Service331;
import fr.spacefox.perftests.quarkus.rest.endpoint331.schema.Schema331;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint331")
public class Endpoint331Resource {

    private final Service331 service;

    public Endpoint331Resource(Service331 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema331 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
