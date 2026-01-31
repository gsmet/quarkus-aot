package fr.spacefox.perftests.quarkus.rest.endpoint936;

import fr.spacefox.perftests.quarkus.core.service936.Service936;
import fr.spacefox.perftests.quarkus.rest.endpoint936.schema.Schema936;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint936")
public class Endpoint936Resource {

    private final Service936 service;

    public Endpoint936Resource(Service936 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema936 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
