package fr.spacefox.perftests.quarkus.rest.endpoint270;

import fr.spacefox.perftests.quarkus.core.service270.Service270;
import fr.spacefox.perftests.quarkus.rest.endpoint270.schema.Schema270;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint270")
public class Endpoint270Resource {

    private final Service270 service;

    public Endpoint270Resource(Service270 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema270 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
