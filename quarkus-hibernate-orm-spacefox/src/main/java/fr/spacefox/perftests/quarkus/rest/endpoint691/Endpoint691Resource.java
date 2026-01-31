package fr.spacefox.perftests.quarkus.rest.endpoint691;

import fr.spacefox.perftests.quarkus.core.service691.Service691;
import fr.spacefox.perftests.quarkus.rest.endpoint691.schema.Schema691;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint691")
public class Endpoint691Resource {

    private final Service691 service;

    public Endpoint691Resource(Service691 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema691 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
