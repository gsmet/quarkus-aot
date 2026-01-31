package fr.spacefox.perftests.quarkus.rest.endpoint67;

import fr.spacefox.perftests.quarkus.core.service67.Service67;
import fr.spacefox.perftests.quarkus.rest.endpoint67.schema.Schema67;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint67")
public class Endpoint67Resource {

    private final Service67 service;

    public Endpoint67Resource(Service67 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema67 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
