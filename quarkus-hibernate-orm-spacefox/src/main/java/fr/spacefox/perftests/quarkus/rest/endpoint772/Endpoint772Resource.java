package fr.spacefox.perftests.quarkus.rest.endpoint772;

import fr.spacefox.perftests.quarkus.core.service772.Service772;
import fr.spacefox.perftests.quarkus.rest.endpoint772.schema.Schema772;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint772")
public class Endpoint772Resource {

    private final Service772 service;

    public Endpoint772Resource(Service772 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema772 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
