package fr.spacefox.perftests.quarkus.rest.endpoint324;

import fr.spacefox.perftests.quarkus.core.service324.Service324;
import fr.spacefox.perftests.quarkus.rest.endpoint324.schema.Schema324;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint324")
public class Endpoint324Resource {

    private final Service324 service;

    public Endpoint324Resource(Service324 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema324 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
