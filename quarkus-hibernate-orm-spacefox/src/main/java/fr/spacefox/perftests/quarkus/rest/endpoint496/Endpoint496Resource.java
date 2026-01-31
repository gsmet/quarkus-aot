package fr.spacefox.perftests.quarkus.rest.endpoint496;

import fr.spacefox.perftests.quarkus.core.service496.Service496;
import fr.spacefox.perftests.quarkus.rest.endpoint496.schema.Schema496;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint496")
public class Endpoint496Resource {

    private final Service496 service;

    public Endpoint496Resource(Service496 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema496 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
