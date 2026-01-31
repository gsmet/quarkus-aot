package fr.spacefox.perftests.quarkus.rest.endpoint802;

import fr.spacefox.perftests.quarkus.core.service802.Service802;
import fr.spacefox.perftests.quarkus.rest.endpoint802.schema.Schema802;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint802")
public class Endpoint802Resource {

    private final Service802 service;

    public Endpoint802Resource(Service802 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema802 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
