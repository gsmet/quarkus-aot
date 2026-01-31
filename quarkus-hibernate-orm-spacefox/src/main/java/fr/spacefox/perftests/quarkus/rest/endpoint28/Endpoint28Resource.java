package fr.spacefox.perftests.quarkus.rest.endpoint28;

import fr.spacefox.perftests.quarkus.core.service28.Service28;
import fr.spacefox.perftests.quarkus.rest.endpoint28.schema.Schema28;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint28")
public class Endpoint28Resource {

    private final Service28 service;

    public Endpoint28Resource(Service28 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema28 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
