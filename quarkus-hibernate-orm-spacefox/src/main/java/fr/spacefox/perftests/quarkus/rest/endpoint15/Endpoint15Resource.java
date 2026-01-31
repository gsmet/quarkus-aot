package fr.spacefox.perftests.quarkus.rest.endpoint15;

import fr.spacefox.perftests.quarkus.core.service15.Service15;
import fr.spacefox.perftests.quarkus.rest.endpoint15.schema.Schema15;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint15")
public class Endpoint15Resource {

    private final Service15 service;

    public Endpoint15Resource(Service15 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema15 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
