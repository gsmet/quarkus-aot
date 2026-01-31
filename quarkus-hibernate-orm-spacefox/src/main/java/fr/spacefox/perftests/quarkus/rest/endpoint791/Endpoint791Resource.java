package fr.spacefox.perftests.quarkus.rest.endpoint791;

import fr.spacefox.perftests.quarkus.core.service791.Service791;
import fr.spacefox.perftests.quarkus.rest.endpoint791.schema.Schema791;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint791")
public class Endpoint791Resource {

    private final Service791 service;

    public Endpoint791Resource(Service791 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema791 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
