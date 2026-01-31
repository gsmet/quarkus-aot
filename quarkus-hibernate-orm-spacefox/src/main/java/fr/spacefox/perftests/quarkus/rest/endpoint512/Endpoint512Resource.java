package fr.spacefox.perftests.quarkus.rest.endpoint512;

import fr.spacefox.perftests.quarkus.core.service512.Service512;
import fr.spacefox.perftests.quarkus.rest.endpoint512.schema.Schema512;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint512")
public class Endpoint512Resource {

    private final Service512 service;

    public Endpoint512Resource(Service512 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema512 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
