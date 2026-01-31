package fr.spacefox.perftests.quarkus.rest.endpoint908;

import fr.spacefox.perftests.quarkus.core.service908.Service908;
import fr.spacefox.perftests.quarkus.rest.endpoint908.schema.Schema908;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint908")
public class Endpoint908Resource {

    private final Service908 service;

    public Endpoint908Resource(Service908 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema908 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
