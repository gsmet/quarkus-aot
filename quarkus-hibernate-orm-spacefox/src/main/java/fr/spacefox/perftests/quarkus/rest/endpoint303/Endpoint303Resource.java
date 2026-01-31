package fr.spacefox.perftests.quarkus.rest.endpoint303;

import fr.spacefox.perftests.quarkus.core.service303.Service303;
import fr.spacefox.perftests.quarkus.rest.endpoint303.schema.Schema303;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint303")
public class Endpoint303Resource {

    private final Service303 service;

    public Endpoint303Resource(Service303 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema303 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
