package fr.spacefox.perftests.quarkus.rest.endpoint369;

import fr.spacefox.perftests.quarkus.core.service369.Service369;
import fr.spacefox.perftests.quarkus.rest.endpoint369.schema.Schema369;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint369")
public class Endpoint369Resource {

    private final Service369 service;

    public Endpoint369Resource(Service369 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema369 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
