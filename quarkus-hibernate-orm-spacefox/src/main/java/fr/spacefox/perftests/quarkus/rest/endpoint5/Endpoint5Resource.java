package fr.spacefox.perftests.quarkus.rest.endpoint5;

import fr.spacefox.perftests.quarkus.core.service5.Service5;
import fr.spacefox.perftests.quarkus.rest.endpoint5.schema.Schema5;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint5")
public class Endpoint5Resource {

    private final Service5 service;

    public Endpoint5Resource(Service5 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema5 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
