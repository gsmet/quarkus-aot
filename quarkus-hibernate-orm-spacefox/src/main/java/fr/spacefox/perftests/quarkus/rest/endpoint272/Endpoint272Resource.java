package fr.spacefox.perftests.quarkus.rest.endpoint272;

import fr.spacefox.perftests.quarkus.core.service272.Service272;
import fr.spacefox.perftests.quarkus.rest.endpoint272.schema.Schema272;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint272")
public class Endpoint272Resource {

    private final Service272 service;

    public Endpoint272Resource(Service272 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema272 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
