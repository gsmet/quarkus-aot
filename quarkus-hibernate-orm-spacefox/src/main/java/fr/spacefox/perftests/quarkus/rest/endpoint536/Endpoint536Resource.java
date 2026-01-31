package fr.spacefox.perftests.quarkus.rest.endpoint536;

import fr.spacefox.perftests.quarkus.core.service536.Service536;
import fr.spacefox.perftests.quarkus.rest.endpoint536.schema.Schema536;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint536")
public class Endpoint536Resource {

    private final Service536 service;

    public Endpoint536Resource(Service536 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema536 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
