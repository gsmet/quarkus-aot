package fr.spacefox.perftests.quarkus.rest.endpoint74;

import fr.spacefox.perftests.quarkus.core.service74.Service74;
import fr.spacefox.perftests.quarkus.rest.endpoint74.schema.Schema74;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint74")
public class Endpoint74Resource {

    private final Service74 service;

    public Endpoint74Resource(Service74 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema74 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
