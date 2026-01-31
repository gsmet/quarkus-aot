package fr.spacefox.perftests.quarkus.rest.endpoint131;

import fr.spacefox.perftests.quarkus.core.service131.Service131;
import fr.spacefox.perftests.quarkus.rest.endpoint131.schema.Schema131;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint131")
public class Endpoint131Resource {

    private final Service131 service;

    public Endpoint131Resource(Service131 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema131 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
