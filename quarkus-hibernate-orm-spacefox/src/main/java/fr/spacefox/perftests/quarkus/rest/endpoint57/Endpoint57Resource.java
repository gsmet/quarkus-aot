package fr.spacefox.perftests.quarkus.rest.endpoint57;

import fr.spacefox.perftests.quarkus.core.service57.Service57;
import fr.spacefox.perftests.quarkus.rest.endpoint57.schema.Schema57;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint57")
public class Endpoint57Resource {

    private final Service57 service;

    public Endpoint57Resource(Service57 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema57 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
