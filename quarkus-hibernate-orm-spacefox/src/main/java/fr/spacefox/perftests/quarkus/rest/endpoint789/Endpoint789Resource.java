package fr.spacefox.perftests.quarkus.rest.endpoint789;

import fr.spacefox.perftests.quarkus.core.service789.Service789;
import fr.spacefox.perftests.quarkus.rest.endpoint789.schema.Schema789;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint789")
public class Endpoint789Resource {

    private final Service789 service;

    public Endpoint789Resource(Service789 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema789 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
