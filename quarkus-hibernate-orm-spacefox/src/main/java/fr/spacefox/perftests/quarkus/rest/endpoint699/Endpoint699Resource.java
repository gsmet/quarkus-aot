package fr.spacefox.perftests.quarkus.rest.endpoint699;

import fr.spacefox.perftests.quarkus.core.service699.Service699;
import fr.spacefox.perftests.quarkus.rest.endpoint699.schema.Schema699;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint699")
public class Endpoint699Resource {

    private final Service699 service;

    public Endpoint699Resource(Service699 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema699 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
