package fr.spacefox.perftests.quarkus.rest.endpoint397;

import fr.spacefox.perftests.quarkus.core.service397.Service397;
import fr.spacefox.perftests.quarkus.rest.endpoint397.schema.Schema397;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint397")
public class Endpoint397Resource {

    private final Service397 service;

    public Endpoint397Resource(Service397 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema397 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
