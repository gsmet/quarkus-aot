package fr.spacefox.perftests.quarkus.rest.endpoint307;

import fr.spacefox.perftests.quarkus.core.service307.Service307;
import fr.spacefox.perftests.quarkus.rest.endpoint307.schema.Schema307;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint307")
public class Endpoint307Resource {

    private final Service307 service;

    public Endpoint307Resource(Service307 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema307 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
