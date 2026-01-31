package fr.spacefox.perftests.quarkus.rest.endpoint867;

import fr.spacefox.perftests.quarkus.core.service867.Service867;
import fr.spacefox.perftests.quarkus.rest.endpoint867.schema.Schema867;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint867")
public class Endpoint867Resource {

    private final Service867 service;

    public Endpoint867Resource(Service867 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema867 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
