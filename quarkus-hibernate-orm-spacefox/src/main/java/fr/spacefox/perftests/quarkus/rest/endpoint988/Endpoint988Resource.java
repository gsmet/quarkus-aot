package fr.spacefox.perftests.quarkus.rest.endpoint988;

import fr.spacefox.perftests.quarkus.core.service988.Service988;
import fr.spacefox.perftests.quarkus.rest.endpoint988.schema.Schema988;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint988")
public class Endpoint988Resource {

    private final Service988 service;

    public Endpoint988Resource(Service988 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema988 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
