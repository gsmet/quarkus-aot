package fr.spacefox.perftests.quarkus.rest.endpoint498;

import fr.spacefox.perftests.quarkus.core.service498.Service498;
import fr.spacefox.perftests.quarkus.rest.endpoint498.schema.Schema498;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint498")
public class Endpoint498Resource {

    private final Service498 service;

    public Endpoint498Resource(Service498 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema498 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
