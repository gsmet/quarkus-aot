package fr.spacefox.perftests.quarkus.rest.endpoint969;

import fr.spacefox.perftests.quarkus.core.service969.Service969;
import fr.spacefox.perftests.quarkus.rest.endpoint969.schema.Schema969;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint969")
public class Endpoint969Resource {

    private final Service969 service;

    public Endpoint969Resource(Service969 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema969 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
