package fr.spacefox.perftests.quarkus.rest.endpoint614;

import fr.spacefox.perftests.quarkus.core.service614.Service614;
import fr.spacefox.perftests.quarkus.rest.endpoint614.schema.Schema614;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint614")
public class Endpoint614Resource {

    private final Service614 service;

    public Endpoint614Resource(Service614 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema614 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
