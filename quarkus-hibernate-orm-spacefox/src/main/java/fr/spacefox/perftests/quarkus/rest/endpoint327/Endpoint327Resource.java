package fr.spacefox.perftests.quarkus.rest.endpoint327;

import fr.spacefox.perftests.quarkus.core.service327.Service327;
import fr.spacefox.perftests.quarkus.rest.endpoint327.schema.Schema327;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint327")
public class Endpoint327Resource {

    private final Service327 service;

    public Endpoint327Resource(Service327 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema327 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
