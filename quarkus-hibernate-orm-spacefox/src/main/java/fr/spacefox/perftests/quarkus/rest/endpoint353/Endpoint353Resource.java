package fr.spacefox.perftests.quarkus.rest.endpoint353;

import fr.spacefox.perftests.quarkus.core.service353.Service353;
import fr.spacefox.perftests.quarkus.rest.endpoint353.schema.Schema353;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint353")
public class Endpoint353Resource {

    private final Service353 service;

    public Endpoint353Resource(Service353 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema353 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
