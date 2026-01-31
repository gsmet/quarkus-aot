package fr.spacefox.perftests.quarkus.rest.endpoint820;

import fr.spacefox.perftests.quarkus.core.service820.Service820;
import fr.spacefox.perftests.quarkus.rest.endpoint820.schema.Schema820;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint820")
public class Endpoint820Resource {

    private final Service820 service;

    public Endpoint820Resource(Service820 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema820 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
