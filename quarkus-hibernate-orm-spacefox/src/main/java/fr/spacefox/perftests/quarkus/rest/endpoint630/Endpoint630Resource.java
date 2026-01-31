package fr.spacefox.perftests.quarkus.rest.endpoint630;

import fr.spacefox.perftests.quarkus.core.service630.Service630;
import fr.spacefox.perftests.quarkus.rest.endpoint630.schema.Schema630;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint630")
public class Endpoint630Resource {

    private final Service630 service;

    public Endpoint630Resource(Service630 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema630 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
