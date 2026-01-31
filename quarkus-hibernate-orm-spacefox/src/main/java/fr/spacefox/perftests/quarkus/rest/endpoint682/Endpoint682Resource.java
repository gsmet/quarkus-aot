package fr.spacefox.perftests.quarkus.rest.endpoint682;

import fr.spacefox.perftests.quarkus.core.service682.Service682;
import fr.spacefox.perftests.quarkus.rest.endpoint682.schema.Schema682;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint682")
public class Endpoint682Resource {

    private final Service682 service;

    public Endpoint682Resource(Service682 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema682 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
