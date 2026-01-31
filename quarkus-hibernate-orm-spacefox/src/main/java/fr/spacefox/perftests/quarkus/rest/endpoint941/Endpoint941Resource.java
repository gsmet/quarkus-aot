package fr.spacefox.perftests.quarkus.rest.endpoint941;

import fr.spacefox.perftests.quarkus.core.service941.Service941;
import fr.spacefox.perftests.quarkus.rest.endpoint941.schema.Schema941;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint941")
public class Endpoint941Resource {

    private final Service941 service;

    public Endpoint941Resource(Service941 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema941 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
