package fr.spacefox.perftests.quarkus.rest.endpoint640;

import fr.spacefox.perftests.quarkus.core.service640.Service640;
import fr.spacefox.perftests.quarkus.rest.endpoint640.schema.Schema640;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint640")
public class Endpoint640Resource {

    private final Service640 service;

    public Endpoint640Resource(Service640 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema640 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
