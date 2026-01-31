package fr.spacefox.perftests.quarkus.rest.endpoint261;

import fr.spacefox.perftests.quarkus.core.service261.Service261;
import fr.spacefox.perftests.quarkus.rest.endpoint261.schema.Schema261;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint261")
public class Endpoint261Resource {

    private final Service261 service;

    public Endpoint261Resource(Service261 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema261 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
