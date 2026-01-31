package fr.spacefox.perftests.quarkus.rest.endpoint509;

import fr.spacefox.perftests.quarkus.core.service509.Service509;
import fr.spacefox.perftests.quarkus.rest.endpoint509.schema.Schema509;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint509")
public class Endpoint509Resource {

    private final Service509 service;

    public Endpoint509Resource(Service509 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema509 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
