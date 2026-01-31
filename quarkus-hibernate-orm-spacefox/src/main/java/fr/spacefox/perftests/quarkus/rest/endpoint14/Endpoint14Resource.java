package fr.spacefox.perftests.quarkus.rest.endpoint14;

import fr.spacefox.perftests.quarkus.core.service14.Service14;
import fr.spacefox.perftests.quarkus.rest.endpoint14.schema.Schema14;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint14")
public class Endpoint14Resource {

    private final Service14 service;

    public Endpoint14Resource(Service14 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema14 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
