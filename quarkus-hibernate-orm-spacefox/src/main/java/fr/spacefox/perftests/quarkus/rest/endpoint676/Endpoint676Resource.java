package fr.spacefox.perftests.quarkus.rest.endpoint676;

import fr.spacefox.perftests.quarkus.core.service676.Service676;
import fr.spacefox.perftests.quarkus.rest.endpoint676.schema.Schema676;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint676")
public class Endpoint676Resource {

    private final Service676 service;

    public Endpoint676Resource(Service676 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema676 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
