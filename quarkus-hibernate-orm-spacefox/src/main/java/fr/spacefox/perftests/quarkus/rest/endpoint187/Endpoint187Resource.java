package fr.spacefox.perftests.quarkus.rest.endpoint187;

import fr.spacefox.perftests.quarkus.core.service187.Service187;
import fr.spacefox.perftests.quarkus.rest.endpoint187.schema.Schema187;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint187")
public class Endpoint187Resource {

    private final Service187 service;

    public Endpoint187Resource(Service187 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema187 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
