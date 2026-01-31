package fr.spacefox.perftests.quarkus.rest.endpoint844;

import fr.spacefox.perftests.quarkus.core.service844.Service844;
import fr.spacefox.perftests.quarkus.rest.endpoint844.schema.Schema844;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint844")
public class Endpoint844Resource {

    private final Service844 service;

    public Endpoint844Resource(Service844 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema844 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
