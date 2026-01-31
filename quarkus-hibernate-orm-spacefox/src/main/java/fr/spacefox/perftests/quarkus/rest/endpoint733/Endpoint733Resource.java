package fr.spacefox.perftests.quarkus.rest.endpoint733;

import fr.spacefox.perftests.quarkus.core.service733.Service733;
import fr.spacefox.perftests.quarkus.rest.endpoint733.schema.Schema733;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint733")
public class Endpoint733Resource {

    private final Service733 service;

    public Endpoint733Resource(Service733 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema733 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
