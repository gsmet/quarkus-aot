package fr.spacefox.perftests.quarkus.rest.endpoint886;

import fr.spacefox.perftests.quarkus.core.service886.Service886;
import fr.spacefox.perftests.quarkus.rest.endpoint886.schema.Schema886;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint886")
public class Endpoint886Resource {

    private final Service886 service;

    public Endpoint886Resource(Service886 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema886 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
