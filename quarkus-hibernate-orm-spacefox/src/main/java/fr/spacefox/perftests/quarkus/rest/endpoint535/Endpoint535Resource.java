package fr.spacefox.perftests.quarkus.rest.endpoint535;

import fr.spacefox.perftests.quarkus.core.service535.Service535;
import fr.spacefox.perftests.quarkus.rest.endpoint535.schema.Schema535;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint535")
public class Endpoint535Resource {

    private final Service535 service;

    public Endpoint535Resource(Service535 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema535 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
