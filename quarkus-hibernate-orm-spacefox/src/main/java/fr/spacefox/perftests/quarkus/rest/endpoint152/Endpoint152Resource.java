package fr.spacefox.perftests.quarkus.rest.endpoint152;

import fr.spacefox.perftests.quarkus.core.service152.Service152;
import fr.spacefox.perftests.quarkus.rest.endpoint152.schema.Schema152;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint152")
public class Endpoint152Resource {

    private final Service152 service;

    public Endpoint152Resource(Service152 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema152 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
