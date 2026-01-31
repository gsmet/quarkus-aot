package fr.spacefox.perftests.quarkus.rest.endpoint686;

import fr.spacefox.perftests.quarkus.core.service686.Service686;
import fr.spacefox.perftests.quarkus.rest.endpoint686.schema.Schema686;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint686")
public class Endpoint686Resource {

    private final Service686 service;

    public Endpoint686Resource(Service686 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema686 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
