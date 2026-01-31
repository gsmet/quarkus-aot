package fr.spacefox.perftests.quarkus.rest.endpoint186;

import fr.spacefox.perftests.quarkus.core.service186.Service186;
import fr.spacefox.perftests.quarkus.rest.endpoint186.schema.Schema186;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint186")
public class Endpoint186Resource {

    private final Service186 service;

    public Endpoint186Resource(Service186 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema186 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
