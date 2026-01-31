package fr.spacefox.perftests.quarkus.rest.endpoint410;

import fr.spacefox.perftests.quarkus.core.service410.Service410;
import fr.spacefox.perftests.quarkus.rest.endpoint410.schema.Schema410;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint410")
public class Endpoint410Resource {

    private final Service410 service;

    public Endpoint410Resource(Service410 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema410 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
