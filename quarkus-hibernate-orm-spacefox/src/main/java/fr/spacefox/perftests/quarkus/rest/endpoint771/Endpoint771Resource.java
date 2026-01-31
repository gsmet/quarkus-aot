package fr.spacefox.perftests.quarkus.rest.endpoint771;

import fr.spacefox.perftests.quarkus.core.service771.Service771;
import fr.spacefox.perftests.quarkus.rest.endpoint771.schema.Schema771;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint771")
public class Endpoint771Resource {

    private final Service771 service;

    public Endpoint771Resource(Service771 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema771 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
