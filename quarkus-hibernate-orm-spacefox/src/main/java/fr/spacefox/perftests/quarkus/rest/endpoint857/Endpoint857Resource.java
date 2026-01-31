package fr.spacefox.perftests.quarkus.rest.endpoint857;

import fr.spacefox.perftests.quarkus.core.service857.Service857;
import fr.spacefox.perftests.quarkus.rest.endpoint857.schema.Schema857;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint857")
public class Endpoint857Resource {

    private final Service857 service;

    public Endpoint857Resource(Service857 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema857 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
