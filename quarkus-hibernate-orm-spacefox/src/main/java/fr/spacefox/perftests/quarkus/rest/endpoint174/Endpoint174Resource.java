package fr.spacefox.perftests.quarkus.rest.endpoint174;

import fr.spacefox.perftests.quarkus.core.service174.Service174;
import fr.spacefox.perftests.quarkus.rest.endpoint174.schema.Schema174;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint174")
public class Endpoint174Resource {

    private final Service174 service;

    public Endpoint174Resource(Service174 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema174 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
