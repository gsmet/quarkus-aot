package fr.spacefox.perftests.quarkus.rest.endpoint252;

import fr.spacefox.perftests.quarkus.core.service252.Service252;
import fr.spacefox.perftests.quarkus.rest.endpoint252.schema.Schema252;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint252")
public class Endpoint252Resource {

    private final Service252 service;

    public Endpoint252Resource(Service252 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema252 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
