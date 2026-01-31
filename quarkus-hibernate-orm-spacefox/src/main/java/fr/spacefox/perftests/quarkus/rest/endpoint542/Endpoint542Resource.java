package fr.spacefox.perftests.quarkus.rest.endpoint542;

import fr.spacefox.perftests.quarkus.core.service542.Service542;
import fr.spacefox.perftests.quarkus.rest.endpoint542.schema.Schema542;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint542")
public class Endpoint542Resource {

    private final Service542 service;

    public Endpoint542Resource(Service542 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema542 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
