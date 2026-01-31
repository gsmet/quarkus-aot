package fr.spacefox.perftests.quarkus.rest.endpoint294;

import fr.spacefox.perftests.quarkus.core.service294.Service294;
import fr.spacefox.perftests.quarkus.rest.endpoint294.schema.Schema294;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint294")
public class Endpoint294Resource {

    private final Service294 service;

    public Endpoint294Resource(Service294 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema294 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
