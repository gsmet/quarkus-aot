package fr.spacefox.perftests.quarkus.rest.endpoint765;

import fr.spacefox.perftests.quarkus.core.service765.Service765;
import fr.spacefox.perftests.quarkus.rest.endpoint765.schema.Schema765;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint765")
public class Endpoint765Resource {

    private final Service765 service;

    public Endpoint765Resource(Service765 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema765 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
