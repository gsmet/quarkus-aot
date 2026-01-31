package fr.spacefox.perftests.quarkus.rest.endpoint829;

import fr.spacefox.perftests.quarkus.core.service829.Service829;
import fr.spacefox.perftests.quarkus.rest.endpoint829.schema.Schema829;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint829")
public class Endpoint829Resource {

    private final Service829 service;

    public Endpoint829Resource(Service829 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema829 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
