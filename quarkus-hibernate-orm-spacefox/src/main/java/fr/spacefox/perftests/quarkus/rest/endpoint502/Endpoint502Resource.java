package fr.spacefox.perftests.quarkus.rest.endpoint502;

import fr.spacefox.perftests.quarkus.core.service502.Service502;
import fr.spacefox.perftests.quarkus.rest.endpoint502.schema.Schema502;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint502")
public class Endpoint502Resource {

    private final Service502 service;

    public Endpoint502Resource(Service502 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema502 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
