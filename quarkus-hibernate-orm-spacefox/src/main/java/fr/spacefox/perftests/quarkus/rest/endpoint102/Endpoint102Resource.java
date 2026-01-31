package fr.spacefox.perftests.quarkus.rest.endpoint102;

import fr.spacefox.perftests.quarkus.core.service102.Service102;
import fr.spacefox.perftests.quarkus.rest.endpoint102.schema.Schema102;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint102")
public class Endpoint102Resource {

    private final Service102 service;

    public Endpoint102Resource(Service102 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema102 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
