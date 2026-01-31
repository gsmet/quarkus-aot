package fr.spacefox.perftests.quarkus.rest.endpoint546;

import fr.spacefox.perftests.quarkus.core.service546.Service546;
import fr.spacefox.perftests.quarkus.rest.endpoint546.schema.Schema546;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint546")
public class Endpoint546Resource {

    private final Service546 service;

    public Endpoint546Resource(Service546 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema546 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
