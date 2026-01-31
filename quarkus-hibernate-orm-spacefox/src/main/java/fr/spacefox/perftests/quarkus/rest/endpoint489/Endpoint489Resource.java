package fr.spacefox.perftests.quarkus.rest.endpoint489;

import fr.spacefox.perftests.quarkus.core.service489.Service489;
import fr.spacefox.perftests.quarkus.rest.endpoint489.schema.Schema489;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint489")
public class Endpoint489Resource {

    private final Service489 service;

    public Endpoint489Resource(Service489 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema489 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
