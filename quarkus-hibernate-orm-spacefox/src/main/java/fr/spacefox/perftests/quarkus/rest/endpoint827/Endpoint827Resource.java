package fr.spacefox.perftests.quarkus.rest.endpoint827;

import fr.spacefox.perftests.quarkus.core.service827.Service827;
import fr.spacefox.perftests.quarkus.rest.endpoint827.schema.Schema827;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint827")
public class Endpoint827Resource {

    private final Service827 service;

    public Endpoint827Resource(Service827 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema827 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
