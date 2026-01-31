package fr.spacefox.perftests.quarkus.rest.endpoint188;

import fr.spacefox.perftests.quarkus.core.service188.Service188;
import fr.spacefox.perftests.quarkus.rest.endpoint188.schema.Schema188;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint188")
public class Endpoint188Resource {

    private final Service188 service;

    public Endpoint188Resource(Service188 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema188 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
