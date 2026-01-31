package fr.spacefox.perftests.quarkus.rest.endpoint251;

import fr.spacefox.perftests.quarkus.core.service251.Service251;
import fr.spacefox.perftests.quarkus.rest.endpoint251.schema.Schema251;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint251")
public class Endpoint251Resource {

    private final Service251 service;

    public Endpoint251Resource(Service251 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema251 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
