package fr.spacefox.perftests.quarkus.rest.endpoint225;

import fr.spacefox.perftests.quarkus.core.service225.Service225;
import fr.spacefox.perftests.quarkus.rest.endpoint225.schema.Schema225;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint225")
public class Endpoint225Resource {

    private final Service225 service;

    public Endpoint225Resource(Service225 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema225 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
