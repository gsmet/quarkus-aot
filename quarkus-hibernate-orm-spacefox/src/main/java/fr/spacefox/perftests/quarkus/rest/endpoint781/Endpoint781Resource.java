package fr.spacefox.perftests.quarkus.rest.endpoint781;

import fr.spacefox.perftests.quarkus.core.service781.Service781;
import fr.spacefox.perftests.quarkus.rest.endpoint781.schema.Schema781;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint781")
public class Endpoint781Resource {

    private final Service781 service;

    public Endpoint781Resource(Service781 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema781 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
