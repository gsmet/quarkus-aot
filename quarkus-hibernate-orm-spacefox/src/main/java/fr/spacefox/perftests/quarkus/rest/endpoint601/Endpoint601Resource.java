package fr.spacefox.perftests.quarkus.rest.endpoint601;

import fr.spacefox.perftests.quarkus.core.service601.Service601;
import fr.spacefox.perftests.quarkus.rest.endpoint601.schema.Schema601;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint601")
public class Endpoint601Resource {

    private final Service601 service;

    public Endpoint601Resource(Service601 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema601 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
