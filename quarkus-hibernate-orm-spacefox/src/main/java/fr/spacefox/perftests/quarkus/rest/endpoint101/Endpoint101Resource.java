package fr.spacefox.perftests.quarkus.rest.endpoint101;

import fr.spacefox.perftests.quarkus.core.service101.Service101;
import fr.spacefox.perftests.quarkus.rest.endpoint101.schema.Schema101;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint101")
public class Endpoint101Resource {

    private final Service101 service;

    public Endpoint101Resource(Service101 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema101 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
