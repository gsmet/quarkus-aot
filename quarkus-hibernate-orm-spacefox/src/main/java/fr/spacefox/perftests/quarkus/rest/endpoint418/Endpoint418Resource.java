package fr.spacefox.perftests.quarkus.rest.endpoint418;

import fr.spacefox.perftests.quarkus.core.service418.Service418;
import fr.spacefox.perftests.quarkus.rest.endpoint418.schema.Schema418;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint418")
public class Endpoint418Resource {

    private final Service418 service;

    public Endpoint418Resource(Service418 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema418 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
