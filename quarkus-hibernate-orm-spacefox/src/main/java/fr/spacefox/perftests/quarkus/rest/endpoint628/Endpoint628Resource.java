package fr.spacefox.perftests.quarkus.rest.endpoint628;

import fr.spacefox.perftests.quarkus.core.service628.Service628;
import fr.spacefox.perftests.quarkus.rest.endpoint628.schema.Schema628;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint628")
public class Endpoint628Resource {

    private final Service628 service;

    public Endpoint628Resource(Service628 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema628 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
