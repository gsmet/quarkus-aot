package fr.spacefox.perftests.quarkus.rest.endpoint437;

import fr.spacefox.perftests.quarkus.core.service437.Service437;
import fr.spacefox.perftests.quarkus.rest.endpoint437.schema.Schema437;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint437")
public class Endpoint437Resource {

    private final Service437 service;

    public Endpoint437Resource(Service437 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema437 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
